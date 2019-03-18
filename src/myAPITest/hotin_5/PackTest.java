package myAPITest.hotin_5;

public class PackTest {
    public static void main(String[] args) {
        Integer i = new Integer(10);
        int i2 = i.intValue();
        int i3 = Integer.parseInt("10");
        System.out.println(i2);
        System.out.println(i3);

        Integer i1 = new Integer("10");
        System.out.println(i1);

        String s = i2 + "";
        String s1 = i.toString();
        String s2 = Integer.toString(20);

        System.out.println(s + s1 + s2);
    }

    public static void compare(int n) {
        if (n >= Math.pow(-2,31) && n <= Math.pow(2,31) - 1) {
            System.out.println("int");
        } else {
            System.out.println("emmm");
        }
    }
}

