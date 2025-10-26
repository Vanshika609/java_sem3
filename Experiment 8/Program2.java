public class Program2 {
    public static void main(String[] args) {
        System.out.println("Vanshika 24csu310");
        try {
            throw new Exception("This is an exception message!");
        } 
        catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } 
        finally {
            System.out.println("Finally block executed.");
        }
    }
}