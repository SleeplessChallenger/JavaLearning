package chapter5;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {

    public static void main(String[] args) {
        demonstrateAdd();

        removeMethod();
    }

    public static void showArrayList() {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(10);
        ArrayList list3 = new ArrayList(list2);

    }

    public static void showArrayListWithGenerics() {
        ArrayList list1 = new ArrayList<String>();

        list1.add("a");

//        ArrayList list2 = new ArrayList<Object>();
    }

    public static void demonstrateAdd() {
        ArrayList list1 = new ArrayList<Integer>(10);

        list1.add(4);
//        list1.add(2, 12);

        // without concrete type
        ArrayList list2 = new ArrayList(15);

        list2.add(2, Boolean.valueOf(true));
        list2.add(6, "New String");
        list2.add(1, 4.0f);
        System.out.println(list1);

        for (Object currIter: list1) {
            System.out.println(currIter);
        }
    }

    public static void removeMethod() {
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");

        birds.remove("hawk");
        birds.remove(0);

    }

    public static void setMethod() {
        List<String> birds = new ArrayList<>();
        birds.add("hawk");

        birds.set(0, "robin");
    }
}
