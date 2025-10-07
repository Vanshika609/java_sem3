import java.util.Scanner;

class Triangle {
    int a, b, c;

    Triangle() {
        a = 3;
        b = 4;
        c = 5;
    }

    void printAreaAndPerimeter() {
        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        int perimeter = a + b + c;

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }

    public static void main(String args[]) {
        System.out.println("Vanshika 24csu310");

        Triangle t = new Triangle();
        t.printAreaAndPerimeter();
    }
}