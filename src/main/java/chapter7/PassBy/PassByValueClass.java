package chapter7.PassBy;

import java.util.ArrayList;
import java.util.List;

public class PassByValueClass {
    public static void main(String[] args) {
        int num = 4;
        newNumber(num);
        System.out.println(num);

        createAggregate();
    }

    public static void newNumber(int num) {
        num = 9;
    }

    public static void createAggregate() {
        List<Integer> ourList = new ArrayList<>();
        ourList.add(4);

        subMethod(ourList);

        System.out.println(ourList);
    }

    private static void subMethod(List<Integer> nums) {
        nums.add(7);
    }
}
