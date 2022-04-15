package chapter7.swan;

import chapter7.duck.MotherDuck;

public class BadCygnet {
    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
//        duck.quack();
//        TODO: as method in the MotherDuck is default, it can't be used in another package
//        System.out.println(duck.noise);
    }
}
