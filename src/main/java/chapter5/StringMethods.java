package chapter5;

import java.util.Locale;

public class StringMethods {

    public StringMethods() { }

    String currName = "newName";

    public int giveLengthOfName() {
        return currName.length();
    }

    public char giveCharAtString() {
        return currName.charAt(2);
    }

    public int giveIndexOf() {
        int firstIndexResult = currName.indexOf('a'); // returns 4
        int secondIndexResult = currName.indexOf("z", 2); // returns -1
        return (firstIndexResult < secondIndexResult) ? firstIndexResult : secondIndexResult;
    }

    public String giveSubStringOf() {
        return currName.substring(1, 4);
    }

    public String giveUpperResult() {
        return currName.toUpperCase(Locale.ROOT);
    }

    public String giveLowerResult() {
        return currName.toLowerCase(Locale.ROOT);
    }

    public boolean giveEquals() {
        return currName.equals(currName);
    }

    public boolean giveEqualsIgnoreCase() {
        return currName.equalsIgnoreCase(currName);
    }

    public boolean giveIfStartsWithValue() {
        return currName.startsWith("new");
    }

    public boolean giveIfEndsWith() {
        return currName.endsWith("me");
    }

    public String replaceCharInString() {
        return currName.replace('e', 'z');
    }

    public boolean containsCharInString() {
        return currName.contains("z");
    }

    public void stripCharacters() {
        String strippedString = currName.strip();
        String trimmedString = currName.trim();
        String strippedAtLeading = currName.stripLeading();
        String strippedTrailing = currName.stripTrailing();
    }

    public void stringMethodChaining() {
        String currString = "sOmeString ";
        String newCurrString = currString.toLowerCase(Locale.ROOT);
        newCurrString = newCurrString.replace("o", "z").trim();
        System.out.println(newCurrString);
    }

}
