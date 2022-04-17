package chapter8.SuperConstructor;

public class SuperConstructor {
    private int age;

    public SuperConstructor(int age) {
        super(); // call to Object
        this.age = age;
    }
}

class Zebra extends SuperConstructor {
    public Zebra(int age) {
        super(age); // refers to parent
    }

    public Zebra() {
        this(5); // refers to `Zebra` in current class & then to `super`
    }
}
