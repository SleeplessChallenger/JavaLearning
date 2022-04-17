package chapter8;

public class ParentWithoutConstructor {

}

class ChildWithConstructor extends ParentWithoutConstructor {
//    public ChildWithConstructor() {
//        System.out.println("In child");
//    }

    public static void main(String... unused) {
        new ChildWithConstructor();
    }
}
