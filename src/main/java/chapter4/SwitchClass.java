package chapter4;

public class SwitchClass {
    int dayOfTheWeek;

    public SwitchClass(int day) {
        // example with if-statement
        dayOfTheWeek = day;
        if (dayOfTheWeek == 0) {
            System.out.println("New Day");
        } else if (dayOfTheWeek == 2) {
            System.out.println("Another new day");
        } else {
            System.out.println("Last another day");
        }

        switch (dayOfTheWeek) {
            case 2:
                System.out.println("New Day");
                break;

            case 3:
                System.out.println("Another new day");
                break;

            case 0:
                System.out.println("Last another day");
                break;

            default:
                /*
                throw something or use default code
                 */
        }

    }
}

class SwitchSecond {

    public void someMethod() {
        var dayOfTheWeek = 5;
        switch(dayOfTheWeek) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
            break;
        }
//        Weekday
//        Saturday

//        if 6:
//        Saturday

//        if 0:
//        Sunday
//        Weekday
//        Saturday
    }
}