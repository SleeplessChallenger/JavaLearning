package chapter7.duck;

public class GoodDucking {
    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
        duck.quack();
        // TODO: as it's default in the class -> can be used in the same package
        System.out.println(duck.noise);
    }
}
