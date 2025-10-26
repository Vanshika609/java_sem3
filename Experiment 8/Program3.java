class BaseException extends Exception {
    public BaseException(String msg) {
        super(msg);
    }
}

class LevelTwoException extends BaseException {
    public LevelTwoException(String msg) {
        super(msg);
    }
}

class LevelThreeException extends LevelTwoException {
    public LevelThreeException(String msg) {
        super(msg);
    }
}

class A {
    void display() throws BaseException {
        throw new BaseException("Exception from Class A (Base Level)");
    }
}

class B extends A {
    void display() throws LevelTwoException {
        throw new LevelTwoException("Exception from Class B (Level 2)");
    }
}

class C extends B {
    void display() throws LevelThreeException {
        throw new LevelThreeException("Exception from Class C (Level 3)");
    }
}

public class Program3 {
    public static void main(String[] args) {
        System.out.println("Vanshika 24csu310");
        A obj = new C();
        try {
            obj.display();
        } 
        catch (BaseException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}