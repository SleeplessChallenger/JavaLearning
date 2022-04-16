package chapter8.Animal;

public class Lion extends Animal {

    public void setProperties(int age, String n) {
        setAge(age); // method from parent
        name = n; // property from parent
    }

    public void roar() {
        // we can't access `age` from parent as it is `private`
        System.out.print(name + ", age: " + getAge() + " says: Roar!");
    }

    public static void main(String[] args) {
        var lion = new Lion();
        lion.setProperties(3, "kion");
        lion.roar();
    }
}
