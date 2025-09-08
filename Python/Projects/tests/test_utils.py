# tests/test_utils.py
from scanner.utils import parse_ports

def test_parse_ports_simple():
    assert parse_ports("22") == [22]
    assert parse_ports("20-22") == [20,21,22]
    assert parse_ports("80,443,1000-1002") == [80,443,1000,1001,1002]
