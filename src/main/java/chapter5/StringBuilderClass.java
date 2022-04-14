package chapter5;

public class StringBuilderClass {

    public static void main(String[] args) {
        useStringBuilder();
    }

    public static void useStringBuilder() {
        StringBuilder newStringBuilder = new StringBuilder();
        // `StringBuilder` is much more efficient compared to ordinary String
        for(char ele = 'a'; ele <= 'z'; ele++) {
            newStringBuilder.append(ele);
        }

        System.out.println(newStringBuilder);
    }

    public void useOneStringBuilder() {
        StringBuilder newString = new StringBuilder("abc");
        StringBuilder secondNewString = newString.append("de"); // same StringBuilder
        secondNewString = secondNewString.append("f").append("a");

        System.out.println(secondNewString);

        // to specify the capacity
        StringBuilder newStringTwo = new StringBuilder(10);
    }

    public void reverseMethod() {
        StringBuilder sb = new StringBuilder("ABC");
        sb.reverse();
    }
}
