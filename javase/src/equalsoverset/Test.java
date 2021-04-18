package equalsoverset;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        date d1=new date();
        d1.setYear(1999);
        d1.setMonth(10);
        d1.setDay(1);
        date d2=new date();
        d2.setYear(1999);
        d2.setMonth(10);
        d2.setDay(1);
        System.out.println(d1.equals(d2));
    }
}
class date {
    private int year;
    private int month;
    private int day;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
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

    @Override
    public String toString() {
        return "date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public boolean equals(Object o) {
       /* if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        date date = (date) o;
        return year == date.year &&
                month == date.month &&
                day == date.day;*/
        date a=(date)o;
        if (month==a.getMonth()&&day==a.getDay()&&year==a.getYear())return true;
        else return false;
    }

}