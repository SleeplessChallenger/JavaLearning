package chapter10;

import java.io.IOException;

public class FallExceptionClass {

    public static void main(String... unused) {
        someMethod();
    }

    void fall(int distance) throws IOException {
        if (distance > 10) {
            throw new IOException();
        }
    }

    void againFall(int distance) {
        try {
            if (distance > 10) {
                throw new IOException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void someMethod() {
        String[] animals = new String[4];
        System.out.println(animals.length);
    }
}
