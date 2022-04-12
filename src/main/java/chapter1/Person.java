package chapter1;

import chapter1.b.Name;

public class Person {

    private Name personName;
    private static int numCreated;

    public Person(Name personName) {
        this.personName = personName;
    }

    public Person() {
        /*
        Empty on purpose - default constructor
         */

        // Single line command
        numCreated ++;
//        numCreated = numCreated + 1;
    }

    public String helloWorld() {
        return "Hello World";
    }

    public String hello(String name) {
        helloWorld();
        return "Hello " + name;
    }

    public Name name() {
        return personName;
    }

    public static int numberOfPersons() {
        return numCreated;
    }

    public boolean isBigger(int i, int j) {
        return i > j;
    }
}
