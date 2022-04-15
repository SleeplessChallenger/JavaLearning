package chapter7;

public class EncapsulatedClass {

    private int numTimes; // no children can override it

    public int getNumTimes() {
        return this.numTimes;
    }

    public void setNumTimes(int newNum) {
        if (newNum >= 0) { // just our throw away check
            numTimes = newNum;
        }
    }
}
