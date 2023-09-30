package ex7_ex11;

public class PaymentDate {
    private int day, month, year;

    public PaymentDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
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
        if ((day <= 0) || (day > 31)) throw new IllegalArgumentException("day can be only from 1 to 31");
        this.day = day;
    }

    public void setMonth(int month) {
        if ((month <= 0) || (month > 12)) throw new IllegalArgumentException("month can be only from 1 to 12");
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static boolean getEqualsDate (PaymentDate date1, PaymentDate date2) {
        if (date1.getDay() != date2.getDay() || date1.getMonth() != date2.getMonth() || date1.getYear() != date2.getYear()) {
            return false;
        }
        else {
            return true;
        }
    }

    public String toString() {
        return String.format ("%d.%d.%d", this.day, this.month, this.year);
    }
}
