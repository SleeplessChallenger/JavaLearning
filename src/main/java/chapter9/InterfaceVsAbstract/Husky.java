package chapter9.InterfaceVsAbstract;

abstract class Husky {
    abstract void play(); // default access-modifier
}

class Webby extends Husky {
    void play() {}
}