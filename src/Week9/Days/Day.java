package Week9.Days;

public enum Day {
    MONDAY(true), TUESDAY(true), WEDNESDAY(true),
    THURSDAY(true), FRIDAY(true),
    SATURDAY(false), SUNDAY(false);
    private boolean weekDay;

    private Day(boolean weekDay) {
        this.weekDay = weekDay;
    }

    public boolean isWeekDay() {
        return this.weekDay;
    }


    @Override
    public String toString() {
        String dagVanWeek = String.format("week %s", isWeekDay() ? "dag" : "end");
        return String.format("%s, (dag %d, %s)", this.name().toLowerCase(), this.ordinal() + 1, dagVanWeek);
    }
}
