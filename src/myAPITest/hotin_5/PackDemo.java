package myAPITest.hotin_5;

public class PackDemo {
    public static void main(String[] args) {
        Integer i = 1;
        int i1 = i;
        //int i1 = i.intValue();
        int i2 = i.intValue() + i1;
        System.out.println(i2);
    }
}
