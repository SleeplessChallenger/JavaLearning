package chapter9.MouseInterface;

public class FieldMouse implements Climb, CanBurrow {

    public Float getSpeed(int age) {
        return 11f;
    }
    // return type is `covariant`
    // by default access modifier of the interface method - `public`
}
