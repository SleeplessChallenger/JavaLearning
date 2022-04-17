package chapter8.SuperConstructor;

public class Animal {
    private int age;
    private String name;

    public Animal(int age, String name) {
        super(); // refers to Object
        this.age = age;
        this.name = name;
    }

    public Animal(int age) {
        super(); // refers to Object
        this.age = age;
        this.name = null;
    }
}

class Gorilla extends Animal {

    public Gorilla(int age) {
        super(age, "Gorilla");
    }

    public Gorilla() {
        super(5);
    }
}
