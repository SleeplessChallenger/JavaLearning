package chapter10;

public class FinallyKeywordClass {

    public static void methodToShowFinally() {
        try {
            seeSomeAnimal();
        } catch (Exception e) {
            recover();
        } finally {
            seeSomeMore();
        }
        someOtherActions();
    }

    public static void seeSomeAnimal() {
        System.out.println("Print some random method");
    }

    static void recover() {
        // .. do something
    }

    static void seeSomeMore() {
        // .. do again more
    }

    static void someOtherActions() {
        // ..
    }
}
