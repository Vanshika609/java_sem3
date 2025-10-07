import java.util.Scanner;

class Complex {
    int real, imag;
    Complex(int r, int i) {
        real = r;
        imag = i;
    }
    void add(Complex c) {
        System.out.println("Sum = " + (real + c.real) + " + " + (imag + c.imag) + "i");
    }
    void subtract(Complex c) {
        System.out.println("Difference = " + (real - c.real) + " + " + (imag - c.imag) + "i");
    }
    void multiply(Complex c) {
        int r = real * c.real - imag * c.imag;
        int i = real * c.imag + imag * c.real;
        System.out.println("Product = " + r + " + " + i + "i");
    }
    public static void main(String args[]) {
        System.out.println("Vanshika 24csu310");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real and imaginary part of 1st number: ");
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();

        System.out.print("Enter real and imaginary part of 2nd number: ");
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        c1.add(c2);
        c1.subtract(c2);
        c1.multiply(c2);
    }
}