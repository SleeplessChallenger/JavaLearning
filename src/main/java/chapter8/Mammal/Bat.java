package chapter8.Mammal;

public class Bat extends Mammal {
    String type = "bat";

    public String getType() {
        String result = super.type + ":" + this.type;
        super.showCode();

        return result;
    }

    public void showCode() {
        // ...
    }

    public static void main(String... zoo) {
        System.out.println(new Bat().getType());
    }
}
