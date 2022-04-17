package chapter9;

public abstract interface InterfaceExample {
    public abstract Float getSpeed(int age);

    public static final int MINIMUM_DEPTH = 2;
}
// `abstract` is implicit => we can omit it
// `final` is also implicit in the interface
// `public` as well implicit