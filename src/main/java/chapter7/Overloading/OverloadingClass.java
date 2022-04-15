package chapter7.Overloading;

public class OverloadingClass {
    // see how method signatures differ
    public void fly(int numMiles) {}
    public void fly(short numFeet) {}

    public boolean fly() {
        return true;
    }

    void fly(int numMiles, short numFeet) {}
    public void fly(short numFeet, int numMiles) throws Exception {}

//    public void fly(int[] lengths) {}
//    public void fly(int... lengths) {}
    // TODO: above is an error as varargs are treated like array

    public void flyHigh(int numMiles) {}

    public void flyHigh(Integer numMiles) {}
}


class TooManyConversions {
    public static void play(Long l) {}
    public static void play(Long... l) {}
    public static void main(String[] args) {
//        play(4);      // DOES NOT COMPILE // TODO: we need long, not Long
        play(4L);     // calls the Long version
    }
}
