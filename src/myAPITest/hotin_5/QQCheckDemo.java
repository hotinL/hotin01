package myAPITest.hotin_5;

import java.util.Scanner;

public class QQCheckDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        boolean isTrue = num.matches("[1-9]\\d {4,14}");
//        boolean isTrue = checkQQ(num);
        System.out.println(isTrue);
    }
    public static boolean checkQQ (String s) {
        if (s.length() < 5 && s.length() > 16) {
            return false;
        }
        if (s.startsWith("0")) {
            return false;
        }

        for (int x = 0; x < s.length(); x++) {
            char a = s.charAt(x);
            if (a < '0' || a > '9') {
                return false;
            }
        }
//        char[] cha = s.toCharArray();
//        for (int x = 0; x < cha.length; x++) {
//            if (cha[x] < '0' || cha[x] > '9') {
//                return false;
//            }
//        }
        return true;
    }
}
