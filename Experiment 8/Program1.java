import java.util.Scanner;

class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}

public class Program1 {
    public static void main(String[] args) {
        System.out.println("Vanshika 24csu310");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter number of arguments: ");
            int n = sc.nextInt();
            if (n < 5) {
                throw new CheckArgumentException("Error: Less than 5 arguments entered!");
            }
            int sum = 0;
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                sum += num;
            }
            System.out.println("Sum of numbers: " + sum);
        } 
        catch (CheckArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}