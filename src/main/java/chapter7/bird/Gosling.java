package chapter7.bird;

public class Gosling extends Bird {
    public void swim() {
        floatInWater(); // as this method is protected -> can be used in children
        System.out.println(text);
    }
}
