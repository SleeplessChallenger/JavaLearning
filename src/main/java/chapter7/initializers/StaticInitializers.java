package chapter7.initializers;

public class StaticInitializers {
    private static final int NUM_SECONDS_PER_MINUTE;
    private static final int NUM_MINUTES_PER_HOUR;
    private static final int NUM_HOURS_PER_HOUR;

    static {
        NUM_MINUTES_PER_HOUR = 54;
        NUM_SECONDS_PER_MINUTE = 13;
    }

    static {
        NUM_HOURS_PER_HOUR = 12;
    }

}
