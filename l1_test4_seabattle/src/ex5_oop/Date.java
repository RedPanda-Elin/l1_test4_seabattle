package ex5_oop;

/**
 * Created by Elin on 18.11.2017.
 */
public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {

    }



    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDay(int day) {
        if (day <= 31) {
            this.day = day;
        }




    }
}
