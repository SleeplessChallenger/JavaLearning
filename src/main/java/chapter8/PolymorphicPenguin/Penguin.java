package chapter8.PolymorphicPenguin;

public class Penguin {
    public int getHeight() {
        return 3;
    }

    public void printInfo() {
        System.out.println(this.getHeight());

        System.out.println(this.canSwim());
    }

    public static boolean canSwim() {
        return false;
    }

    // if you want to trigger `getHeight()` in current class,
    // redefine `printInfo()` in child and use `super` from there
}
