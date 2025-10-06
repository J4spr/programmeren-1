package Week3;

import java.util.Calendar;

public class Dag {
    public static void main(String[] args) {
        int dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        System.out.println(getDayOfWeekNewMethod(dayOfWeek));
        System.out.println(getDayOfWeekOldMethod(dayOfWeek));

    }

    static String getDayOfWeekOldMethod(int dayOfWeek) {
        String dayOfWeekasString = "";
        switch (dayOfWeek) {
            case 1:
                dayOfWeekasString = "zondag";

            case 2:
                dayOfWeekasString = "maandag";

            case 3:
                dayOfWeekasString = "dinsdag";

            case 4:
                dayOfWeekasString = "woensdag";

            case 5:
                dayOfWeekasString = "donderdag";

            case 6:
                dayOfWeekasString = "vrijdag";

            case 7:
                dayOfWeekasString = "zaterdag";

            default:
                dayOfWeekasString = "Dit is geen geldig getal";
        }
        ;
        return dayOfWeekasString;
    }

    static String getDayOfWeekNewMethod(int dayOfWeek) {
        return switch (dayOfWeek) {
            case 1 -> "zondag";
            case 2 -> "maandag";
            case 3 -> "dinsdag";
            case 4 -> "woensdag";
            case 5 -> "donderdag";
            case 6 -> "vrijdag";
            case 7 -> "zaterdag";
            default -> "Dit is geen geldig getal";
        };
    }
}
