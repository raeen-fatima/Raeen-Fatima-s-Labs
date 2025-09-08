# scanner/utils.py
import json
import csv
from typing import List

COMMON_SERVICES = {
    20: "FTP-data", 21: "FTP", 22: "SSH", 23: "Telnet", 25: "SMTP",
    53: "DNS", 67: "DHCP", 80: "HTTP", 110: "POP3", 123: "NTP",
    143: "IMAP", 161: "SNMP", 194: "IRC", 443: "HTTPS", 3306: "MySQL",
    3389: "RDP"
}

def parse_ports(port_str: str) -> List[int]:
    """
    Parse a port expression like "22,80,100-200" -> sorted unique list of ints.
    """
    ports = set()
    if not port_str:
        return []
    parts = port_str.split(",")
    for p in parts:
        p = p.strip()
        if not p:
            continue
        if "-" in p:
            a, b = p.split("-")
            a, b = int(a), int(b)
            if a > b:
                a, b = b, a
            for i in range(max(1, a), min(65535, b) + 1):
                ports.add(i)
        else:
            ports.add(int(p))
    return sorted([x for x in ports if 0 < x < 65536])

def detect_service(port: int) -> str:
    return COMMON_SERVICES.get(port, "")

def save_json(path: str, data):
    with open(path, "w", encoding="utf-8") as f:
        json.dump(data, f, indent=2)

def save_csv(path: str, data):
    # data: list of dicts with 'port','service','banner'
    with open(path, "w", newline='', encoding="utf-8") as f:
        writer = csv.writer(f)
        writer.writerow(["port", "service", "banner"])
        for item in data:
            writer.writerow([item.get("port"), item.get("service"), item.get("banner","")])
