package chapter9.Bear;

abstract class Bear {
    abstract CharSequence chew();

    public Bear() {
        System.out.println(chew());
    }
}