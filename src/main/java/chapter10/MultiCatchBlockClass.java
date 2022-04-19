package chapter10;

import java.io.FileInputStream;
import java.io.IOException;

public class MultiCatchBlockClass {

    public static void main(String[] args) {
        methodForMultipleExceptions(args);
    }

    public static void methodForMultipleExceptions(String[] args) {
        try {
            System.out.println(Integer.parseInt(args[1]));
        } catch ( ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Missing or invalid input");
        }
    }
}
