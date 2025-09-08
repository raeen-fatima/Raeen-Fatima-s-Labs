# scanner/core.py
import socket
from concurrent.futures import ThreadPoolExecutor, as_completed
from typing import List, Dict, Tuple

def is_port_open(host: str, port: int, timeout: float = 0.5, do_banner: bool = False) -> Tuple[bool, str]:
    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    s.settimeout(timeout)
    try:
        res = s.connect_ex((host, port))
        if res == 0:
            banner = ""
            if do_banner:
                try:
                    # try to receive small banner (some services send on connect)
                    s.settimeout(1.0)
                    banner = s.recv(1024).decode(errors="ignore").strip()
                except Exception:
                    banner = ""
            s.close()
            return True, banner
        else:
            s.close()
            return False, ""
    except Exception:
        try:
            s.close()
        except:
            pass
        return False, ""

def scan_ports(host: str, ports: List[int], workers: int = 100, timeout: float = 0.5, do_banner: bool = False):
    """
    Scan ports using ThreadPoolExecutor. Returns list of dicts for open ports.
    """
    open_ports = []
    if not ports:
        return open_ports

    with ThreadPoolExecutor(max_workers=min(workers, len(ports))) as ex:
        future_to_port = {ex.submit(is_port_open, host, p, timeout, do_banner): p for p in ports}
        for future in as_completed(future_to_port):
            port = future_to_port[future]
            try:
                ok, banner = future.result()
                if ok:
                    open_ports.append({"port": port, "banner": banner})
            except Exception:
                # ignore errors on individual ports
                pass

    open_ports.sort(key=lambda x: x["port"])
    return open_ports
