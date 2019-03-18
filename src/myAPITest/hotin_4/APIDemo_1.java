package myAPITest.hotin_4;

public class APIDemo_1 {
    public static void main(String[] args) {
        new test();
        System.gc();
    }

    public static void method_3() {
        long start = System.currentTimeMillis();
        for (int x = 0; x < 1000; x ++) {
            System.out.println(x);
//           while(x == 99) {
//               break;
//           }
        }
        Long end = System.currentTimeMillis();
        long result = (end - start);
        System.out.println(result);
    }

    public static void method() {
        int[] src = {1,2,3,4,5};
        int[] dest = new int[5];

        System.arraycopy(src,0,dest,1,4);
        for (int x = 0; x < dest.length; x++) {
            System.out.print(dest[x] + ",");
        }
    }
}
class test {
    @Override
    public void finalize() {
        System.out.println("gc");
    }
}
