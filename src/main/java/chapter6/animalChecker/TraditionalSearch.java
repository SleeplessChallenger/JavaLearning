package chapter6.animalChecker;

import java.util.*;
import java.util.function.Predicate;

public class TraditionalSearch {
    public static void main(String[] args) {

        List<AnimalClass> animals = new ArrayList<AnimalClass>();
        animals.add(new AnimalClass("fish", false, true));
        animals.add(new AnimalClass("rabbit", true, false));
        animals.add(new AnimalClass("turtle", false, true));

//        print(animals, new CheckIfHopper());
        print(animals, a -> a.canHop());

        print(animals, new Predicate<AnimalClass>() {
            @Override
            public boolean test(AnimalClass a) {
                return !a.canSwim();
            }
        });

//        { (AnimalClass a) -> { return a.canHop() ;} };

    }

//    private static void print(List<AnimalClass> animals, CheckTrait hooper) {
    private static void print(
            List<AnimalClass> animals,
            Predicate<AnimalClass> hooper
    ) {
        for (AnimalClass currAnimal: animals) {
            if (hooper.test(currAnimal)) {
                System.out.println(currAnimal + " ");
            }
        }
    }

}
