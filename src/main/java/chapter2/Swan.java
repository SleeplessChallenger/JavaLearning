package chapter2;

public class Swan {
    int numEggs;
    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numEggs = 1;
        System.out.println(mother.numEggs);
    }
}

class NewName {
    String first = "Theodore";
    String last = "Moose";
    String fullName = first + last;
}