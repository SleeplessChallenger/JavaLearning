package chapter7.initializers;

import java.util.ArrayList;

public class Initializers {
    private static final int NUM_BUCKETS = 45;
    public static void main(String[] args) {
//        NUM_BUCKETS = 5; // TODO: doesn't compile as final can't be changed
        addNewValueToList();
    }

    private static final ArrayList<String> numValues = new ArrayList<>();

    public static void addNewValueToList(int... nums) {
        numValues.add("changed");
    }


}
