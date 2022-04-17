package chapter8;

public class OrderOfInitializationClass {

    static {
        System.out.println("Inside OrderOfInitializationClass static");
    }

    {
        System.out.println("Inside OrderOfInitializationClass instance");
    }

    public OrderOfInitializationClass() {
        System.out.println("A");
    }
}

class B extends OrderOfInitializationClass {

    static {
        System.out.println("Inside B static");
    }
    public B() {
        System.out.println("B");
    }
}

class C extends B {
    public C() {
        System.out.println("C");
    }

    public static void main(String... unused) {
        System.out.println("D");
        new C();
    }
}