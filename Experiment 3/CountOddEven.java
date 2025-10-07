import java.util.Scanner;

public class CountOddEven
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int odd = 0, even = 0;
        for (int num : arr)
        {
            if (num % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println(" Count of even numbers " + even);
        System.out.println(" Count of odd numbers " + odd);

        System.out.println("Vanshika 24csu310");
        sc.close();
    }
}
