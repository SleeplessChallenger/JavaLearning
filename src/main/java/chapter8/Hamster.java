package chapter8;

public class Hamster {
    private String color;
    private int weight;

    private static int COUNT_INSTANCES = 0;

    public Hamster(int weight) {
        this(weight, "black"); // to prevent duplicate code
        COUNT_INSTANCES++;
    }

    public Hamster(int weight, String color) {
        this.color = color;
        this.weight = weight;
        COUNT_INSTANCES++;
    }

    public static void main(String... unused) {
        new Hamster(5);
        new Hamster(10, "Tom");
        System.out.println(COUNT_INSTANCES);
    }
}
