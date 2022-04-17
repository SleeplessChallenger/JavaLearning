package chapter8.GenericsOverriding;

import java.util.ArrayList;
import java.util.List;

public class Anteater extends LongTailAnimal {

    protected void chew(List<Object> input) { }

//    protected void chew(List<Double> input) {} // doesn't compile due to type erasure

    protected void swim(ArrayList<String> input) {} // overloaded, not overridden
}
