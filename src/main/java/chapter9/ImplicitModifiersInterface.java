package chapter9;

// TODO: those 2 interfaces below are similar to each other
//  first is implicit & second is explicit

public interface ImplicitModifiersInterface {
    int MAX_HEIGHT = 5;
    final static boolean UNDERWATER = true;
    void fly(int speed);
    abstract void takeOff();
    public abstract double drive();
}

abstract interface SimilarToTheUpperOne {
    public static final int MAX_HEIGHT = 7;
    public static final boolean UNDERWATER = true;
    public abstract void fly(int speed);
    public abstract void takeOff();
    public abstract double drive();
}