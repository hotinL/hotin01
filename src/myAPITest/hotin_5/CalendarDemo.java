package myAPITest.hotin_5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

//        System.out.println(Calendar.YEAR);
        c.set(Calendar.MONTH,3);
        c.add(Calendar.MONTH,1);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH ) + 1;
        int day = c.get(Calendar.DAY_OF_MONTH);


        System.out.println(year + "-" + month + "-" + day);
    }
}
