package chapter2;

public class Chick {
    public Chick() {
        System.out.println("In constructor");
    }
}

class Chicken {
    int numEggs = 12;
    String name;
    public Chicken() {
        this.name = "Duke";
    }
}
