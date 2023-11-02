

public class Time {
    private int hour;
    private int minute;
    private int second;

    private boolean isRightHour(int hour) {
        return hour >= 0 && hour <= 23;
    }

    private boolean isRightMinute(int minute) {
        return minute >= 0 && minute <= 59;
    }

    private boolean isRightSecond(int second) {
        return second >= 0 && second <= 59;
    }

    public Time(int hour, int minute, int second) {
        if (isRightHour(hour) && isRightMinute(minute) && isRightSecond(second)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (isRightHour(hour)) {
            this.hour = hour;
        }
    }

    public void setMinute(int minute) {
        if (isRightMinute(minute)) {
            this.minute = minute;
        }
    }

    public void setSecond(int second) {
        if (isRightSecond(second)) {
            this.second = second;
        }
    }

    public void setTime(int hour, int minute, int second) {
        if (isRightHour(hour) && isRightMinute(minute) && isRightSecond(second)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}

class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(20, 20, 20);
        System.out.println(t1.toString());
    }
}
