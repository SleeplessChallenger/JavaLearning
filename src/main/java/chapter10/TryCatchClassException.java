package chapter10;

public class TryCatchClassException {

    public static void main(String... unused) {
        explore();
    }

    static void explore() {
        try {
            fall();
            System.out.println("never get here");
        } catch (RuntimeException e) {
//            throw e;
            System.out.println("Bypassing exception");
        }
        seeAnimal();
    }

    static void fall() {
        throw new RuntimeException();
    }

    static void seeAnimal() {
        System.out.println("Here, after exception");
    }
}
