package chapter6.Supplier;

import java.util.function.Supplier;

public class SupplierClass {

    public static void main(String[] args) {
        Supplier<Integer> number = () -> 42;
        System.out.println(returnNumber(number));
    }

    public static int returnNumber(Supplier<Integer> supplier) {
        return supplier.get();
    }
}
