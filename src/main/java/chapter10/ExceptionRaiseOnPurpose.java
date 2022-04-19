package chapter10;

public class ExceptionRaiseOnPurpose {
    private int number;

    public ExceptionRaiseOnPurpose() {
        this.number = 93;
    }

    public static void main(String... unused) {
        ourMethod(4);
        ourMethod(-1);
    }

    public static void ourMethod(int num) {
        if (num >= 0) {
            System.out.println(num);
        } else {
            throw new IllegalArgumentException("Num mustn't be negative");
        }
    }
}
