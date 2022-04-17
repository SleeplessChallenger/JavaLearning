package chapter8;

public class Elephant {
    int age;

    public Elephant(int age) {
        this.age = age;
    }
}

// we need to define constructor here as we need to put some value
class SmallElephant extends Elephant {
    public SmallElephant() {
        super(10);
    }
}

class ChildElephant extends SmallElephant {}