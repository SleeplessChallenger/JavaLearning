package chapter9.InterfaceVsAbstract;

interface Poodle {
    void play(); // public access-modifier
}

class Georgette implements Poodle {
    public void play() {};
}