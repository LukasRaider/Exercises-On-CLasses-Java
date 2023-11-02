
class Date {
    private int day;
    private int month;
    private int year;

    private boolean isRightDay(int day) {
        return day >= 1 && day <= 31;
    }

    private boolean isRightMonth(int month) {
        return month >= 1 && month <= 12;
    }

    private boolean isRightYear(int year) {
        return year >= 1900 && year <= 9999;
    }

    public Date(int day, int month, int year) {
        if (isRightDay(day) && isRightMonth(month) && isRightYear(year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            System.out.println("Wrong set date.");
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}

class TestDate {
    public static void main(String[] args) {
        Date d1 = new Date(2, 6, 1999);
        System.out.println(d1.toString());
        Date d2 = new Date(21, 110, 2003);
        System.out.println(d2.toString());
        d2.setDay(33);
        System.out.println(d2.toString());
    }
}
