package chapter8;

// various things regarding classes

public class Bunny {
    public Bunny() {
        System.out.println("constructor");
    }
}

class Bonobo {
//    public Bonobo(var age) {
//        TODO: you can't put `var` in the constructor
//    }
}

class Turtle {
    private String name;

    public Turtle() {
        name = "John Doe";
    }

    public Turtle(int age) {}

    public Turtle(long age) {}

    public Turtle(String newName, String... favouriteFoods) {
        name = newName;
    }
}