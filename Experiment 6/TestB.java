interface A {
    void displayA();
}

interface B extends A {
    void displayB();
}

class TestB implements B {
    public void displayA() {
        System.out.println("Display from A");
    }

    public void displayB() {
        System.out.println("Display from B");
    }

    public static void main(String[] args) {
        TestB obj = new TestB();
        obj.displayA();
        obj.displayB();
        System.out.println("Vanshika 24csu310");  
    }
}