package chapter8.PolymorphicPenguin;

public class EmperorPenguin extends Penguin {
    public int getHeight() {
        return 8;
    }

    public static void main(String... unused) {
        new EmperorPenguin().printInfo();
        new EmperorPenguin().printInfo();
    }

    public static boolean canSwim() {
        return true;
    }
}
