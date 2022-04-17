package chapter9.AnotherMultipleInheritanceInterface;

public interface CanFly {
    public static final int SOME_VARIABLE = 54;

    public void flap();

    public default void someMethod() {
        System.out.println(3);
    }
}
