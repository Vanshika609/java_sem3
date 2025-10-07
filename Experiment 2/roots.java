import java.util.Scanner;
class roots
{
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a,b,c in ax^2 + bx + c ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

		double d = Math.sqrt(b * b - 4 * a * c);
		double r1 = (-b+d)/(2*a);
		
		double r2 = (-b-d)/(2*a);

		System.out.println(" First Root is\n"+ r1); 
		System.out.println(" Second Root is"+ r2); 
		 System.out.println("Vanshika 24csu310");

	}
}