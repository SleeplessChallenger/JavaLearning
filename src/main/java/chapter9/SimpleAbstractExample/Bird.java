package chapter9.SimpleAbstractExample;

abstract class Bird {
    public abstract String getName();

    public void printName() {
        System.out.println(getName());
    }

}
