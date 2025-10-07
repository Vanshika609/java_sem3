import java.util.Scanner;
public class BoxTest {

   
    static class Box {
        float length, breadth, height;

        
        Box() {
            length = breadth = height = 0;
        }

        
        Box(float l, float b, float h) {
            length = l;
            breadth = b;
            height = h;
        }

        
        Box(Box box) {
            this.length = box.length;
            this.breadth = box.breadth;
            this.height = box.height;
        }

        
        void displayVolume() {
            float volume = length * breadth * height;
            System.out.println("Volume: " + volume);
        }
    }

    
    static class BoxWithWeight extends Box {
        float weight;

        
        BoxWithWeight() {
            super();
            weight = 0;
        }

       
        BoxWithWeight(float l, float b, float h, float w) {
            super(l, b, h); 
            weight = w;
        }

      
        BoxWithWeight(BoxWithWeight bw) {
            super(bw); 
            this.weight = bw.weight;
        }

        
        void displayWeight() {
            System.out.println("Weight: " + weight);
        }
    }

    
    public static void main(String[] args) {
       
        BoxWithWeight box1 = new BoxWithWeight(3, 4, 5, 12.5f);
        System.out.println("Box 1:");
        box1.displayVolume();
        box1.displayWeight();

       
        BoxWithWeight box2 = new BoxWithWeight();
        System.out.println("\nBox 2:");
        box2.displayVolume();
        box2.displayWeight();

        
        BoxWithWeight box3 = new BoxWithWeight(box1);
        System.out.println("\nBox 3 (Copy of Box 1):");
        box3.displayVolume();
        box3.displayWeight();
        System.out.println("Vanshika 24csu310");
    }
}