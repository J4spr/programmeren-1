package Week9.Days;

public class Main {
    public static void main(String[] args) {
        Day day = Day.MONDAY;
        System.out.printf("%s\n", day);
        System.out.printf("%d", day.ordinal());

        System.out.printf("%s \n", day.isWeekDay() ? "is een weekdag": "is geen weekdag");
    }
}
