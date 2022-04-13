package chapter4;

import java.util.ArrayList;
import java.util.List;

public class LoopClass {

    public static void showWhileLoop() {
        int counter = 10;

        while (counter < 10) {
            double price = counter * 10;
            System.out.println(price);
            counter ++;
        }

        int roomInBelly = 10;
        int bitesOfCheese = 15;

        while (roomInBelly > 0 && bitesOfCheese > 0) {
            roomInBelly--;
            bitesOfCheese--;
        }
    }

    public static void doWhileLoop() {
        int i = 1;

        do {
            System.out.println("New Stuff");
            i++;
        } while (i < 5);
    }

    public static void doWhileAnotherLoop() {
        int i = 12;

        if (i > 8) {
            do {
                System.out.println("Something interesting");
                i ++;
            } while (i > 8);
        }
    }

    public static void forLoopExample() {
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // reverse loop
        for(int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        // loop with `var`
        for(var i = 7; i > 2; i--) {
            System.out.println(i);
        }

        // modified loop: use `x` in loop, but don't use it in first part (aka assign can't be done)
        int x = 0;
        for(long y = 0, z = 0; y < 5 && x < 8; y++, x++) {
            System.out.println(y);
        }
    }

    public static void exampleOfForEachLoop() {
        int[] namesArray = {4,2,8,5};

        for(int value: namesArray) {
            System.out.println(value);
        }

        final String[] names = new String[5];
        names[0] = "Lisa";
        names[1] = "Kevin";
        names[2] = "Roger";

        for(String name: names) {
            System.out.println(name + ", ");
        }

        List<String> allNames = new ArrayList<String>();
        allNames.add("Lisa");
        allNames.add("Kevin");
        allNames.add("Roger");

        for(String name: allNames) {
            System.out.println(name + ", ");
        }
    }

    public static void mixedForAndForEachLoop() {
        int[][] ourTwoDArray = {{4,6,7,1}, {9,1,5,3}, {2,7,4,3}};

        for(int[] innerArray: ourTwoDArray) {
            for(int i = 0; i < innerArray.length; i++) {
                System.out.println(innerArray[i]);
            }
        }
    }

    public static void multipleWhileDoLoops() {
        int hungryAnimal = 8;

        // `do` is a nested loop which will execute till it's condition os broken
        while (hungryAnimal > 2) {
            do {
                hungryAnimal -= 2;
            } while (hungryAnimal > 3);
            hungryAnimal--;
            System.out.println(hungryAnimal);
        }
    }

    public static void loopWithLabel() {
        int targetValue = 5;

        int[][] list = {{1,6,4}, {9,1,4}, {4,2,8}};
        PARENT_LOOP: for(int i=0; i < list.length; i++) {
            for(int j=0; j < list[i].length; j++) {
                if (list[i][j] == targetValue) {
                    break PARENT_LOOP; // here we break from the whole loop
                }
            }
        }
    }

    public static void continueWhileLoop() {
        int i = 4;

        optionalLabel: while (i < 1) {
            // body

            continue optionalLabel;
        }
    }
}
