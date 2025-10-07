import java.util.Scanner;

class Student {
    String name;
    int roll_no;

    public static void main(String args[]) {
        System.out.println("Vanshika 24CSU310");

        Student s = new Student();
        s.name = "John";
        s.roll_no = 2;

        System.out.println("Name: " + s.name);
        System.out.println("Roll No: " + s.roll_no);
    }
}