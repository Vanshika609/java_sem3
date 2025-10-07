import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int a = num / 100;          
        int b = (num / 10) % 10;    
        int c = num % 10;          

        int reverse = c * 100 + b * 10 + a; 

        System.out.println("Reverse of " + num + " = " + reverse);
        System.out.println("Vanshika 24csu310");

      
    }
}
