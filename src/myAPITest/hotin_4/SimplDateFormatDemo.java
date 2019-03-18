package myAPITest.hotin_4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimplDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat s3 = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        Date d3 = new Date();

        String s = s3.format(d3);
        System.out.println(s);

        Date d4 = s3.parse("2019年02月16日23:45:04");
        System.out.println(d4);
    }

    public static void method_2() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = new Date();

        //格式化 String format(Date d)
        String s = simpleDateFormat.format(date);
        System.out.println(s);

        //解析 Date parse(String s)
        Date d1 = simpleDateFormat.parse("2019年2月16日");
        System.out.println(d1);
    }

    public static void method() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date d = new Date();

        //SimpleDateFoprmat格式化
        String s = sdf.format(d);// String format(Date d)
        System.out.println(s);//19-2-16 下午11:08

        //SimpleDateFormat解析
        Date d1 = sdf.parse("19-2-16 下午11:08");//Date parse(SimpleDateFormat统一格式)
        System.out.println(d1);
    }
}
