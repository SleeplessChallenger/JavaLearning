package chapter2;

public class VarExample {

    public static void main(String[] args) {
        stubMethod();
        typeChanger();
    }

    static public void stubMethod() {
        var age = 43;
        age = 54;
    }

    static public void typeChanger() {
        var apples = (byte) 15;
        apples = (char) 'a';
    }
}
