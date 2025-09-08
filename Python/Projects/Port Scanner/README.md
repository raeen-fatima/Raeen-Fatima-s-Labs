
---

# 🟢 Python Port Scanner

A simple **Python-based port scanner** for **ethical use only**.
It scans specified ports of a target host/IP, detects services, optionally grabs banners, and saves results to JSON or CSV. Supports **multi-threading** for faster scanning.

---

## ⚡ Features

* Scan **single IP/host** or **range of ports**
* **Service detection** for common ports
* **Banner grabbing** for open ports
* **Multi-threaded** scanning for speed
* **Save results** in JSON or CSV
* **Colored terminal output** using `colorama` (Windows-friendly)
* Optional **.bat script** for easy one-click scan

---

## 🗂 Project Structure

```
Port Scanner/
├─ scanner/
│  ├─ __init__.py
│  ├─ core.py       # Core scanning logic
│  ├─ utils.py      # Helper functions (port parsing, service detection, save)
│  └─ cli.py        # Command-line interface
├─ run_local.bat    # One-click Windows runner
├─ venv/            # Python virtual environment
└─ README.md
```

---

## 🛠 Requirements

* Python 3.10+
* `colorama` library

Install dependencies in your virtual environment:

```bash
pip install colorama
```

---

## 🚀 Usage

### 1️⃣ Command Line (recommended)

Run from project root:

```bash
python -m scanner.cli -t <TARGET> -p <PORTS> [-w WORKERS] [-to TIMEOUT] [-b] [--service-detect] [-o OUTPUT]
```

**Arguments:**

| Flag               | Description                                    |
| ------------------ | ---------------------------------------------- |
| `-t, --target`     | Target host or IP (required)                   |
| `-p, --ports`      | Ports (e.g. 22,80,8000-8100), default `1-1024` |
| `-w, --workers`    | Number of threads, default `100`               |
| `-to, --timeout`   | Socket timeout (seconds), default `0.5`        |
| `-b, --banner`     | Attempt banner grabbing on open ports          |
| `--service-detect` | Show common service name for ports             |
| `-o, --output`     | Save results to file (`.json` or `.csv`)       |

**Example:**

```bash
python -m scanner.cli -t 127.0.0.1 -p 22,80,443 -b --service-detect -o results.json
```

---

### 2️⃣ Using Windows Batch File

Double-click `run_local.bat` to:

* Activate virtual environment
* Scan `127.0.0.1` ports `1-1024`
* Grab banners and detect services
* Save results to `results.json`
* Colored output in CMD

> You can edit `run_local.bat` to change target, ports, and output file.

---

### 3️⃣ Using Jupyter Notebook

You can import functions from `scanner/core.py` and `scanner/utils.py`:

```python
from scanner.core import scan_ports
from scanner.utils import parse_ports, detect_service

host = "127.0.0.1"
ports = parse_ports("22,80,443")
results = scan_ports(host, ports)

for r in results:
    port = r["port"]
    service = detect_service(port)
    banner = r.get("banner","")
    print(f"Port {port} ({service}) - {banner[:50]}")
```

Optional: Convert results to **DataFrame**:

```python
import pandas as pd

df = pd.DataFrame([{"port":r["port"], "service": detect_service(r["port"]), "banner": r.get("banner","")} for r in results])
df
```

---

## ⚠️ Disclaimer

* **For educational and ethical use only.**
* Scanning networks without permission is **illegal**.
* Use responsibly on systems you own or have explicit permission to test.

---

## 📄 License

MIT License – free to use for learning and personal projects.

---

