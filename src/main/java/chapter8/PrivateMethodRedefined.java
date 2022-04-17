package chapter8;

public class PrivateMethodRedefined {

    private String getNumber() {
        return "Undefined";
    }
}

class AnotherPrivateMethodClass extends PrivateMethodRedefined {

    private int getNumber() {
        return 5;
    }

}