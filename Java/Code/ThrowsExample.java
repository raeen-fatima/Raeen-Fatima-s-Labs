package Code;
import java.io.*;

public class ThrowsExample {

    // method declares that it might throw IOException
    public static void readFile() throws IOException {
        FileReader file = new FileReader("somefile.txt");
        file.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File not found or cannot be read");
        }
    }
}

