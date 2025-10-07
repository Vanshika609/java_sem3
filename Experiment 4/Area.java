import java.util.Scanner;

class Area{
    int length, breadth;

    Area(int l, int b) {
        length = l;
        breadth = b;
    }
    int returnArea() {
        return length * breadth;
    }
    public static void main(String args[]) {
        System.out.println("Vanshika 24csu310");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        Area a = new Area(l, b);
        System.out.println("Area = " + a.returnArea());
    }
}