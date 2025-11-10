import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class SimpleReadWrite {
    public static void main(String[] args) {
        String filename = "example.txt";

        // Write to file
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Hello, this is a simple file handling example.\n");
            writer.write("We are performing read and write operations in Java.");
            System.out.println("Data has been written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Read from file
        try (FileReader reader = new FileReader(filename)) {
            System.out.println("\nReading data from the file:");
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
        System.out.println("Vanshika 24csu310");

    }
}