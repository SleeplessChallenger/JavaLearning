package chapter9.SimpleAbstractExample;

public class Stork extends Bird {
    public String getName() {
        return "Stork!";
    }

    public static void main(String... unused) {
        new Stork().printName();
    }
}
