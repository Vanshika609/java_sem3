import java.util.Scanner;

public class RemoveDuplicates
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println(" Enter " + n + " elements ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int[] temp = new int[n];
        int newSize = 0;

        for (int i = 0; i < n; i++)
        {
            boolean duplicate = false;
            for (int j = 0; j < newSize; j++)
            {
                if (arr[i] == temp[j])
                {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate)
            {
                temp[newSize++] = arr[i];
            }
        }

        System.out.print(" Array after removing duplicates ");
        for (int i = 0; i < newSize; i++)
        {
            System.out.print(temp[i] + " ");
        }
        System.out.println();

        System.out.println("Vanshika 24csu310");
        sc.close();
    }
}
