interface X {
    void showX();
}

interface Y {
    void showY();
}

interface Z extends X, Y {
    void showZ();
}

class TestC implements Z {
    public void showX() {
        System.out.println("Show from X");
    }

    public void showY() {
        System.out.println("Show from Y");
    }

    public void showZ() {
        System.out.println("Show from Z");
    }

    public static void main(String[] args) {
        TestC obj = new TestC();
        obj.showX();
        obj.showY();
        obj.showZ();
        System.out.println("Vanshika 24csu310");  
    }
}