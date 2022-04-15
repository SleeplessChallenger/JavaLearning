package chapter7.bird;

public class Bird {
    protected String text = "floating";

    protected void floatInWater() { // means can be accessed in the same package + children
        System.out.println(text);
    }
}
