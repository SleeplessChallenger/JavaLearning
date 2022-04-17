package chapter8.Fish;

public class Shark extends Fish {
    private int numberOfFins = 8;

    public Shark(int age) {
        super(age); // navigate to parent
        this.size = 4; // navigate to parent
    }

    public void displaySharkDetails() {
        System.out.println("Shark with age " + getAge());
        System.out.println(" and " + size + " meters long" );
        System.out.println(" with " + numberOfFins + " fins");
    }
}
