package chapter5;

import java.util.Arrays;
import java.util.Objects;

public class StringBuilderMethods {

    public static void main(String[] args) {
        showAppendMethod();

        deleteMethod();

        replaceMethod();

        equalsStringBuilder();
    }

    public void methodsResembleString() {
        // length, indexOf, charAt, substring
        StringBuilder sb = new StringBuilder("animals");

        String sub = sb.substring(sb.indexOf("n"), sb.indexOf("l"));

        int lengthOfString = sb.length();

        char ch = sb.charAt(3);

        System.out.println(sub + " " + lengthOfString + " " + ch);
    }

    public static void showAppendMethod() {
        StringBuilder sb = new StringBuilder().append(1).append('b');
        sb.append("-").append(true);
        System.out.println(sb);
    }

    public static void showInsertMethod() {
        StringBuilder sb = new StringBuilder("animals");
        sb.insert(7, "-");
        sb.insert(0, "-");
    }

    public static void deleteMethod() {
        StringBuilder sb = new StringBuilder("abfdgf");
        sb.delete(1, 3);

        StringBuilder sb2 = new StringBuilder("fgbfd");
        sb2.delete(1, 20000);
    }

    public static void replaceMethod() {
        StringBuilder sb = new StringBuilder("fderf");
        sb.replace(2, 32, "a");

        System.out.println(sb);
    }

    public static void equalsStringBuilder() {
        StringBuilder one = new StringBuilder("gd");
        StringBuilder two = new StringBuilder("gd");

        System.out.println(one.toString() == two.toString()); //

        StringBuilder three = one.append("f");

        System.out.println(one.equals(two)); // false
        System.out.println(one == two); // false

        System.out.println(three == one); // true
    }
}

class ArrayTime {
    public static void main(String[] args) {
        String [] bugs = {"cricket", "beetle", "ladybug"};
        String [] alias = bugs;

        System.out.println(bugs.equals(alias));
        System.out.println(Arrays.toString(bugs));

        String[] names = new String[3];

        accessArray();
    }

    public static void castingArrays() {
        String[] strings = { "StringValue" };
        Object[] objects = strings; // object is broader

        String[] againStrings = (String[]) objects;

    }

    public static void accessArray() {
        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals[0]);

        for (int i = 0; i < mammals.length; i++) {
            System.out.println(mammals[i]);
        }

        int[] allNumbers = new int[5];
        for (int i = 0; i < allNumbers.length; i++) {
            allNumbers[i] = i + 8;
        }

        Arrays.sort(allNumbers);

        System.out.println(Arrays.toString(allNumbers));
    }
}
