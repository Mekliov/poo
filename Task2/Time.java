package Task2;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
    String info;
    String currTime;
    String currDate;

    public Time(String info) {
        this.info = info;
        Date date = now();
        currTime = toString(date, "hh:mm:ss");
        currDate = toString(date, "dd.MM.YY");
        System.out.println("Current Time " + currTime);
        System.out.println("Current Date is  " + currDate);

    }

    public String getTime() {
        return currTime;
    }

    public String getDate() {
        return currDate;
    }
    public String getInfo()
    {
        return info;
    }

    protected Date now() {
        Date date = new Date();
        return date;
    }

    public String toString(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);

        return sdf.format(date).toString();
    }

}
