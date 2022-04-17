package chapter9.AnotherMultipleInheritanceInterface;

public class Owl implements HasBigEyes {
    
    public int hunt() {
        return 6;
    }

    public void flap() {
        System.out.println("Flap!");
    }
    
    public static void main(String... unused) {
        Owl currOwl = new Owl();
        System.out.println(currOwl.SOME_VARIABLE);
    }
}
