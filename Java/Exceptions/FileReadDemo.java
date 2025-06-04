//Use Case 1: File Handling (Checked Exception)

package Exceptions;
import java.io.*;

public class FileReadDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("file.txt");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("IO Exception occurred");
        } finally {
            System.out.println("\nFile read operation completed");
        }
    }
}
