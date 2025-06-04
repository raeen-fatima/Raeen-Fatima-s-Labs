package Exceptions;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
//If you try to read a file that does not exist, Java throws this exception.
public class FileNotFound_Demo {
    public static void main(String[] args) {
        try {
            File file = new File("C://nonexistentfile.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: File does not exist.");
        }
    }
}
//OUTPUT:
  //FileNotFoundException caught: File does not exist.

