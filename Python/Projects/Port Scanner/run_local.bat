@echo off
REM --------------------------------------------
REM Port Scanner Runner (Windows)
REM Double-click to run scan on localhost
REM --------------------------------------------

REM Navigate to project root (change path if needed)
cd /d D:\GitHubClone\Raeen-Fatima-s-Labs\Python\Projects\Port Scanner

REM Activate virtual environment
call venv\Scripts\activate

REM Run the scanner (localhost example)
python -m scanner.cli -t 127.0.0.1 -p 1-1024 -b --service-detect -o results.json

REM Pause to see output
pause
