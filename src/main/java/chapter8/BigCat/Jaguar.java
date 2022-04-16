package chapter8.BigCat;

import javax.sound.midi.SysexMessage;

public class Jaguar extends BigCat {
    public Jaguar() {
        size = 10.2; // defined in the parent class
    }

    public void printDetails() {
        System.out.println(size);
    }

}
