package Week7;


public class MondelingExamen {
}

class Time {
    private int hour;
    private int minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;

    }

    public Time(Time otherTime) {
        this(otherTime.getHour(), otherTime.getMinute());
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public void addMinutes(int amountOfMinutes) {
        if (amountOfMinutes > 60) {
            amountOfMinutes -= 60;
            ++this.hour;
            this.minute += amountOfMinutes;
        }
    }

    @Override
    public String toString() {
        return String.format("%d:%d\n", this.hour, this.minute);
    }
}

class Schedule {
    Time[] times;

    public Schedule(Time[] times) {
        this.times = times;
    }

    public Time[] createSchedule(int numberOfStudents, int minutesPerExam, Time start) {
        Time[] schedulesTimes = {new Time(5, 57), new Time(5, 58)};
        return schedulesTimes;
    }

    public String printSchedule() {
        return "hello";
    }
}
