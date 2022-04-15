package chapter6.animalChecker;

public class CheckIfHopper implements CheckTrait {
    public boolean test(AnimalClass a) {
        return a.canHop();
    }
}
