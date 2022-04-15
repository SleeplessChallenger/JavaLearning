package chapter7.duck;

public class FatherDuck {
    private String noise = "quack";

    private void quack() {
        System.out.println(noise);
    }

    private void makeNoise() {
        quack(); // from the same class, hence we can call method with private
    }
}
