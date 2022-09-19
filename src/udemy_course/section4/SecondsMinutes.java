package udemy_course.section4;

public class SecondsMinutes {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 3));
        System.out.println(getDurationString(3945L));
    }

    public static String leadingZeroesFormat(long value) {
        String valueString = Long.toString(value);
        if (value < 10) valueString = "0" + valueString;
        return valueString;
    }
    public static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) return INVALID_VALUE_MESSAGE;
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        String hoursString = hours + "h";
        return leadingZeroesFormat(hours) + "h "
                + leadingZeroesFormat(remainingMinutes) + "m "
                + leadingZeroesFormat(seconds) + "s";
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0) return INVALID_VALUE_MESSAGE;
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }
}
