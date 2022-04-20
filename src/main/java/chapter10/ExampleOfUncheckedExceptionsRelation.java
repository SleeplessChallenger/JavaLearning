package chapter10;

import java.lang.reflect.InaccessibleObjectException;

// TODO: here you can see that we have UncheckedException thrown ->
//  no need to specify it in the parent

public class ExampleOfUncheckedExceptionsRelation {
    public void runSomeStuff() {}
}

class OurChild extends ExampleOfCustomCheckedException {
    public void runSomeStuff() throws SomeCustomException {}
}


class SomeCustomException extends ArithmeticException { }
