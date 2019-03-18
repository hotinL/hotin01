package myAPITest.hotin_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileToArr {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> stu = new ArrayList<Student>();
        BufferedReader br = new BufferedReader(new FileReader("stuArr.txt"));
        String str;
        while((str = br.readLine()) != null) {
            String[] strArr = str.split(",");
            Student s = new Student();
            s.setNum(Integer.valueOf(strArr[0]));
            s.setName(strArr[1]);
            s.setAge(Integer.valueOf(strArr[2]));
            s.setAddress(strArr[3]);
            stu.add(s);
        }
        br.close();

        System.out.println("学号\t姓名\t年龄\t地址");
        for (int x = 0; x < stu.size(); x++) {
            Student s = stu.get(x);
            StringBuilder sb = new StringBuilder();
            sb.append(s.getNum() +"\t").append(s.getName() + "\t").append(s.getAge() + "\t\t").append(s.getAddress());
            String str1 = sb.toString();
            System.out.println(str1);
        }
    }
}
