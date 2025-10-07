class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}
interface Pet {
    void beFriendly();
}
interface Playful {
    void play();
}
class Dog extends Animal implements Pet, Playful {
    public void beFriendly() {
        System.out.println("Dog is friendly");
    }

    public void play() {
        System.out.println("Dog loves to play");
    }
}
public class TestA {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();          
        d.beFriendly();   
        d.play();    
        System.out.println("Vanshika 24csu310");     
    }
}