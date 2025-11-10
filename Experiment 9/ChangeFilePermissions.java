import java.io.File;
import java.util.Scanner;

public class ChangeFilePermissions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String path = sc.nextLine();

        File file = new File(path);

        if (!file.exists()) {
            System.out.println("The specified file does not exist.");
            return;
        }

        System.out.println("\nCurrent Permissions:");
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Executable: " + file.canExecute());

        System.out.println("\nChanging permissions...");
        file.setReadable(true);
        file.setWritable(false);
        file.setExecutable(true);

        System.out.println("\nUpdated Permissions:");
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Executable: " + file.canExecute());
        System.out.println("Vanshika 24csu310");

    }
}