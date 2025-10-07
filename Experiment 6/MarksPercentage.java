abstract class Marks {
    abstract double getPercentage();
}
class A extends Marks {
    double m1, m2, m3;

    A(double m1, double m2, double m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    double getPercentage() {
        return (m1 + m2 + m3) / 3;
    }
}
class B extends Marks {
    double m1, m2, m3, m4;

    B(double m1, double m2, double m3, double m4) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
    }
    double getPercentage() {
        return (m1 + m2 + m3 + m4) / 4;
    }
}
public class MarksPercentage {
    public static void main(String[] args) {
        A studentA = new A(85, 90, 80);
        B studentB = new B(75, 88, 92, 81);
        System.out.println("Percentage of Student A: " + studentA.getPercentage());
        System.out.println("Percentage of Student B: " + studentB.getPercentage());
        System.out.println("Vanshika 24csu310");
    }
}