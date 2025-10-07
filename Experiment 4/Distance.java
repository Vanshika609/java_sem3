import java.util.Scanner;

class Distance {
    static double calculate(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
    }

    public static void main(String args[]) {
        System.out.println("Vanshika 24csu310");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 and y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double d = calculate(x1, y1, x2, y2);
        System.out.println("Distance = " + d);
    }
}