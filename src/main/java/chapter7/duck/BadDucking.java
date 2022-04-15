package chapter7.duck;

public class BadDucking {
    public void makeNoise() {
        FatherDuck duck = new FatherDuck();
//        duck.quack();
// TODO: doesn't compile as we call private method from another class
//        System.out.println(duck.noise);
    }
}
