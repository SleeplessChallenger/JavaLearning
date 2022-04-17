package chapter8;

public class MethodHiding {

    public static void eat() {
        System.out.println("Bear is eating");
    }

    public final static void swim() { // can't be hidden by children
        System.out.println("Bear is swimming");
    }

}

class AnotherMethodHiding extends MethodHiding {

    public static void eat() {
        System.out.println("Panda is chewing");
    }

//    public final static void swim() {
//        System.out.println("Panda is swimming");
    // TODO: doesn't compile as `final`. But if you use private in both: redeclared
//    }

    public static void main(String... unused) {
        eat();
    }
}
