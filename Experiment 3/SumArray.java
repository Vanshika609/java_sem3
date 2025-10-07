import java.util.Scanner;

public class SumArray
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

        int sumAll = 0, sumAlt = 0;
        for (int i = 0; i < n; i++)
        {
            sumAll += arr[i];
            if (i % 2 == 0)
                sumAlt += arr[i];
        }

        System.out.println(" Sum of all elements " + sumAll);
        System.out.println(" Sum of alternate elements " + sumAlt);

        System.out.println("Vanshika 24csu310");
        sc.close();
    }
}
