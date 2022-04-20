package chapter10;

public class ExampleOfCustomCheckedException {
    public static void main(String[] args) {
        try {
            eatCarrot();
        } catch (NoMoreCarrots e) {
            System.out.println("In the catch block");
            e.printStackTrace();
        } finally {
            System.out.println("Yeah, we've handled it");
        }
    }

    private static void eatCarrot() throws NoMoreCarrots {
        throw new NoMoreCarrots();
    }
}

class NoMoreCarrots extends Exception { }