package chapter6;

import java.util.ArrayList;
import java.util.List;

public class LambdaApiClass {

    public static void main(String[] args) {
//        removeIfMethod();

        sortLambda();
    }

    public static void removeIfMethod() {
        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");

        bunnies.removeIf(ele -> ele.charAt(0) != 'h');
        System.out.println(bunnies);
    }

    public static void sortLambda() {
        List<String> cars = new ArrayList<>();
        cars.add("Honda");
        cars.add("Toyota");
        cars.add("Mazda");
        cars.add("Acura");

        cars.sort((c1, c2) -> c1.compareTo(c2));
        System.out.println(cars);
    }

    public static void forEachMethod() {
        List<String> animals = new ArrayList<>();
        animals.add("giraffe");
        animals.add("dog");
        animals.add("cat");

        animals.forEach(ele -> System.out.println(ele));
    }
}
