package chapter6;

import java.util.function.Consumer;

public class LambdaExamplesClass {

    public static void main(String[] args) {
        whatAmI();
    }

    public static void whatAmI() {
//        consume((var x) -> System.out.println(x), 123);
//
        // TODO: this `Consumer` is put automatically
        consume(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        }, 123);
    }

    public static void consume(Consumer<Integer> c, int num) {
        c.accept(num);
    }
}
