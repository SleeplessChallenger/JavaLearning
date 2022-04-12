package chapter2;

// enter `main()` -> start execution from the beginning
// line 8 -> line 12 -> line 16
public class NewBird {

    private String name = "Fluffy bird";
    { System.out.println("setting field"); }

    public NewBird() {
        name = "Danny bird";
        System.out.println("Setting name in the constructor");
    }
    public static void main(String[] args) {
        NewBird bird = new NewBird();
        System.out.println(bird.name);
    }
}
