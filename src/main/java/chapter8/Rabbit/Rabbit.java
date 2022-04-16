package chapter8.Rabbit;

// if we don't specify any constructor -> default will be used
public class Rabbit {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
    }
}

class Rabbit2 {
    public Rabbit2() {

    }
}

class Rabbit3 {
    public Rabbit3(boolean b) {

    }
}

class Rabbit4 {
    private Rabbit4() {}
}
