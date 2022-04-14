package chapter5;

public class StringPoolClass {

    public static void main(String[] args) {
        showStringPool();

        showInternStringPool();
    }

    public static void showStringPool() {
        String x = "Hello World";
        String y = " Hello World";
        y = y.stripLeading();
        System.out.println(y.equals(x)); // true

        String newX = "Some";
        String newY = "Some";

        System.out.println(newX == newY); // true as String Pool

        newX = newX + "a";
        System.out.println(newX == newY); // false
    }

    public static void showInternStringPool() {
        String beforeString = "SomeString";

        String newString = new String("SomeString").intern();
        System.out.println(beforeString == newString); // as we use `intern()` on String Pool

        String afterString = new String("SomeString").intern();
        System.out.println(beforeString == afterString);
    }
}
