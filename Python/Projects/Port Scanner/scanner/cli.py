# scanner/cli.py
import argparse
import socket
from scanner.utils import parse_ports, detect_service, save_json, save_csv
from scanner.core import scan_ports
import sys
from colorama import Fore, Style, init

def main():
    # initialize colorama
    init(autoreset=True)

    parser = argparse.ArgumentParser(description="Simple Python Port Scanner (ethical use only)")
    parser.add_argument("-t", "--target", required=True, help="Target host or IP")
    parser.add_argument("-p", "--ports", default="1-1024", help="Ports (e.g. 22,80,8000-8100)")
    parser.add_argument("-w", "--workers", type=int, default=100, help="Number of threads/workers")
    parser.add_argument("-to", "--timeout", type=float, default=0.5, help="Socket timeout (seconds)")
    parser.add_argument("-b", "--banner", action="store_true", help="Attempt banner grabbing on open ports")
    parser.add_argument("-o", "--output", help="Save results to file (json or csv extension)")
    parser.add_argument("--service-detect", action="store_true", help="Show common service name for ports")
    args = parser.parse_args()

    # Resolve host
    try:
        host_ip = socket.gethostbyname(args.target)
    except Exception as e:
        print(f"Could not resolve target {args.target}: {e}")
        sys.exit(1)

    ports = parse_ports(args.ports)
    print(f"Scanning {args.target} ({host_ip}) ports: {len(ports)} with {args.workers} workers, timeout={args.timeout}")

    # Scan ports
    results = scan_ports(host_ip, ports, workers=args.workers, timeout=args.timeout, do_banner=args.banner)

    # Annotate services
    annotated = []
    for r in results:
        port = r["port"]
        banner = r.get("banner","")
        service = detect_service(port) if args.service_detect else ""
        annotated.append({"port": port, "service": service, "banner": banner})

    # Print results with color
    if annotated:
        print("\nOpen ports found:")
        for item in annotated:
            s = f"Port {item['port']}"
            if item['service']:
                s += f" ({item['service']})"
            if item['banner']:
                s += f"  - banner: {item['banner'][:80]}"
            print(Fore.GREEN + s)  # open ports green
    else:
        print(Fore.RED + "\nNo open ports found (or filtered).")

    # Save output if requested
    if args.output:
        if args.output.lower().endswith(".json"):
            save_json(args.output, annotated)
        elif args.output.lower().endswith(".csv"):
            save_csv(args.output, annotated)
        else:
            print(Fore.YELLOW + "Output extension not recognised. Use .json or .csv")
        print(Fore.GREEN + f"Saved results to {args.output}")

if __name__ == "__main__":
    main()
