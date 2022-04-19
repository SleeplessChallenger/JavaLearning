package chapter10;

import java.io.IOError;

public class MultipleExceptionsCatching {

    public void methodToCatch() {
        try {
            visitAnimal();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("first exception caught");
        } catch (IOError e) {
            System.out.println("second exception caught");
        }
    }

    void visitAnimal() {
        System.out.println("Just message");
    }
}
