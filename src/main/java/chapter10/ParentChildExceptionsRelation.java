package chapter10;

import java.io.IOError;

public class ParentChildExceptionsRelation {
    public void hop() throws CanNotHopException { }

    public void hopTwo() throws Exception { }
}

class Bunny extends ParentChildExceptionsRelation {
    public void hop() {}

    public void hopTwo() throws IOError { }
}

class CanNotHopException extends Exception {}
