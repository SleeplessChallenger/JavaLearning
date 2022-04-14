package chapter5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertingClasses {

    public static void main(String[] args) {
        convertArrays();
    }

    public static void convertArrays() {
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");

        Object[] objectArray = list.toArray();

        String[] stringArray = list.toArray(new String[0]);

        System.out.println(stringArray.length);

        list.clear();

        System.out.println(objectArray.length);
        System.out.println(stringArray.length);
    }

    public static void convertList() {
        String[] array = {"hawk", "robin"};
        List<String> list = Arrays.asList(array);

        list.set(1, "TEST");
        array[0] = "Super New";
    }

    public static void immutableList() {
        String[] array = {"hawk", "robin"};
        List<String> list = List.of(array); // immutable list

        array[0] = "test";
    }

    public static void varargList() {
        List<String> list1 = Arrays.asList("a", "b");
        List<String> list2 = List.of("d", "e");
    }

    public static void convertArrayList() {
        List<String> fixedSizeList = Arrays.asList("a", "b", "c");
        List<String> expandableList = new ArrayList<>(fixedSizeList);
    }

    public static void sortingArrayList() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);

        Collections.sort(numbers);
    }

}
