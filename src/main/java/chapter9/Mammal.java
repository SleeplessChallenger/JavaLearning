package chapter9;

abstract class Mammal {
    abstract void showHorn();
    abstract void eatLeaf();
}

abstract class Rhino extends Mammal {
    void showHorn() {}; // this abstract class defines one of the methods for Mammal abstract
}

class BlackRhino extends Rhino {
    void eatLeaf() {};
    // this child needs to implement all the remaining abstract methods.
    // `showHorn()` was already implemented in the second abstract class, hence you can, but not required
}
