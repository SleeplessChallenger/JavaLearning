package chapter8;

public class Flamingo {
    private String color;

    public void setColor(String color) {
        color = color; // will assign to the `color` in this scope
        this.color = color; // will assign to the instance variable
    }

    public static void main(String... unused) {
        Flamingo f = new Flamingo();
        f.setColor("Pink");
        System.out.println(f.color);
    }
}
