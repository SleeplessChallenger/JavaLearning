package chapter5;

public class ConcatenateClass {

    public ConcatenateClass() {
        System.out.println(1 + 2);
        System.out.println("a" + "b");
        System.out.println("a" + "b" + 3); // ab3
        System.out.println(1 + 2 + "c"); // 3c
        System.out.println("c" + 1 + 2); // c12
    }
}
