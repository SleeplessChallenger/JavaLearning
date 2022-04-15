package chapter5;

import java.util.*;

public class SetMapClass {

    public static void main(String[] args) {
        showSetExample();

        showMapExample();
    }

    public static void showSetExample() {
        Set<Integer> set = new HashSet<>();
        System.out.println(set.add(4));
        System.out.println(set.add(9));
        System.out.println(set.add(4));

        int currSize = set.size();
        System.out.println(currSize);

        boolean isEmpty = set.isEmpty();
        System.out.println(isEmpty);
    }

    public static void showMapExample() {
        Map<Integer, Boolean> map = new HashMap<>();

        map.put(4, true);
        map.put(54, false);

        boolean currVal = map.get(4);
        boolean anotherCUrrVal = map.getOrDefault(43, true);

        for (Integer k: map.keySet()) {
            System.out.println(k + " " + map.get(k));
        }

        String ourString = "some";
        for (int i = 0; i < ourString.length(); i++) {
            Character letter = ourString.charAt(i);

        }

        Collection<Boolean> allValues = map.values();
        System.out.println(allValues);
    }

    public static void giveRandomNumber() {
        // 0 <= x < 1
        double num = Math.random();

    }
}
