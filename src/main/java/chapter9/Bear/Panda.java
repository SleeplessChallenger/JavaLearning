package chapter9.Bear;

public class Panda extends Bear {
    String chew() {
        return "yummy";
    }

    public static void main(String... unused) {
        new Panda();
    }
}
