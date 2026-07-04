package javafxproject;

public class DateTime {

    private int year;
    private int month;
    private int day;
    private int Hour;

    public DateTime(int year, int month, int day, int Hour) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.Hour = Hour;
    }

    public DateTime() {
        this(0,0,0,0);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 2024) {
            System.out.println("invalid year");
        } else {
            this.year = year;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            System.out.println("invalid year");
        } else {
            this.month = month;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day < 1 || day > 31) {
            System.out.println("invalid year");
        } else {
            this.day = day;
        }
    }

    public int getHour() {
        return Hour;
    }

    public void setHour(int Hour) {
        this.Hour = Hour;
    }

    @Override
    public String toString() {
        return String.format("Year: %d\nMonth: %d\nDay: %d\nHour: %d\n", year,month,day,Hour);
    }

}
