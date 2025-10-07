interface GeometricObject {
    double getPerimeter();
    double getArea();
}
interface Resizable {
    void resize(int percent);
}
class Circle implements GeometricObject {
    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Circle [radius = " + radius + "]";
    }
}
class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    public void resize(int percent) {
        radius = radius * percent / 100.0;
    }

    public String toString() {
        return "ResizableCircle [radius = " + radius + "]";
    }
}
public class ResizableCircleDemo {
    public static void main(String[] args) {
        ResizableCircle rc = new ResizableCircle(10.0);
        System.out.println("Before resize: " + rc);
        System.out.println("Area: " + rc.getArea());
        System.out.println("Perimeter: " + rc.getPerimeter());
        rc.resize(50);
        System.out.println("\nAfter resize (50%): " + rc);
        System.out.println("Area: " + rc.getArea());
        System.out.println("Perimeter: " + rc.getPerimeter());
        System.out.println("Vanshika 24csu310");
    }
}