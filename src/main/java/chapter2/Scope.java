package chapter2;

public class Scope {
    public static void main(String[] args) {
        String one, two;
        one = new String("a"); // one object in a heap
        two = new String("b"); // another object in a heap
        one = two; // destroy reference to "a" & link to "b"
        String three = one;
        one = null;
    }
}
