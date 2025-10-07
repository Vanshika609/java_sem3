import java.util.Scanner;
 public class Months
 {
 	public static void main(String[] args) {
 		
 		Scanner scan = new Scanner(System.in);
 		 		System.out.println("Enter miniutes");
 		long miniutes = scan.nextInt();
 		long remainingDays ;
 		long days = miniutes / (60*24);
 		long years = days/365;
 		remainingDays = days % 365;
 		long months = remainingDays/30;
 		remainingDays = remainingDays % 30;
 
 		System.out.println("miniutes = " + miniutes +"years = " + years + "months = " + months + "Days = " +remainingDays);
		System.out.println("Vanshika 24Csu310");

 		scan.close();
 	}
 }