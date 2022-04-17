package chapter8.Fish;

public class Fish {
    protected int size; // if we define it not in constructor -> child has no access
    private int age = 43;

    public Fish(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
