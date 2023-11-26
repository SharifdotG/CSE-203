package Spring2023.Mid.Two;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void addHours(int hr) {
        hour += hr;
        if (hour > 23) {
            hour -= 24;
        }
    }

    public void addMinutes(int min) {
        minute += min;
        if (minute > 59) {
            minute -= 60;
            addHours(min % 60);
        }
    }

    public void addSeconds(int sec) {
        second += sec;
        if (second > 59) {
            second -= 60;
            addMinutes(sec % 60);
        }
    }

    public String getTime() {
        return String.format("%d:%d:%d", hour, minute, second);
    }
}
