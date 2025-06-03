package Code;

abstract class DataParser {
    // template method - defines the steps
    public void parseData() {
        readData();
        processData();
        writeData();
    }
    
    abstract void readData();    // abstract steps
    abstract void processData();
    
    void writeData() {           // concrete step
        System.out.println("Writing data to file");
    }
}

class CSVParser extends DataParser {
    void readData() {
        System.out.println("Reading data from CSV file");
    }
    void processData() {
        System.out.println("Processing CSV data");
    }
}

class JSONParser extends DataParser {
    void readData() {
        System.out.println("Reading data from JSON file");
    }
    void processData() {
        System.out.println("Processing JSON data");
    }
}

public class AbstractEx {
    public static void main(String[] args) {
        DataParser parser = new CSVParser();
        parser.parseData();
        
        parser = new JSONParser();
        parser.parseData();
    }
}
//OUTPUT
// Reading data from CSV file
// Processing CSV data
// Writing data to file
// Reading data from JSON file
// Processing JSON data
// Writing data to file

