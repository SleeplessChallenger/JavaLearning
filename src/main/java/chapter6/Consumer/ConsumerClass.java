package chapter6.Consumer;

import java.util.function.Consumer;

public class ConsumerClass {
    public static void main(String[] args) {
        Consumer<String> consumer = x -> System.out.println(x);
        print(consumer, "Some Phrase");
    }

    private static void print(Consumer<String> consumer, String value) {
        consumer.accept(value);
    }
}
