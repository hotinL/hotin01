package myAPITest.hotin_4;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);
        System.out.println(d1.getTime());

        Date d2 = new Date(0L);
        d2.setTime(1550328645789L);
        System.out.println(d2);
    }
}
