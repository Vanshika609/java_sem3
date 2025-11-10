import java.io.*;

public class StudentFileIO {
    public static void main(String[] args) {
        String filename = "students.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            bw.write("Serial No.\tFirst Name\tCGPA\tGrade\n");
            bw.write("1\t\tNeyasa\t\t9.5\tA\n");
            bw.write("2\t\tDevansh\t\t9\tA\n");
            bw.write("3\t\tAlice\t\t7.8\tB\n");
            bw.write("4\t\tJack\t\t9.4\tA\n");
            System.out.println("Data written successfully to " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        System.out.println("\nReading data from file:");
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
       System.out.println("Vanshika 24csu310");

    }
}