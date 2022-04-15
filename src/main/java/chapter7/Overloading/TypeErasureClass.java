package chapter7.Overloading;

import java.util.List;

public class TypeErasureClass {

    public static void methodArrayOne(int[] nums) {
        //
    }

    public static void methodArrayOne(Integer[] nums) {
        //
    }

//    public static void methodListOne(List<String> nums) {
//        //
//    }
//
//    public static void methodListOne(List<Integer> nums) {
//
//    }
    // TODO: last 2 won't compile due to type erasure
}
