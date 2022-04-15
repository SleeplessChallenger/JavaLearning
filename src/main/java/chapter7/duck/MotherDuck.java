package chapter7.duck;

public class MotherDuck {
    String noise = "quack";

    void quack() { // default access, hence can be used from the same package
        System.out.println(noise);
    }

    private void makeNoise() {
        quack();
    }
}
