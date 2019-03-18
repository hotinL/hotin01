package myAPITest.hotin_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrToFile {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> stuArr = new ArrayList<Student>();
        addStu(stuArr);
        addStu(stuArr);
        addStu(stuArr);

        BufferedWriter bw = new BufferedWriter(new FileWriter("stuArr.txt"));

        for (int x = 0; x < stuArr.size(); x++) {
            Student s = stuArr.get(x);
            StringBuilder sb = new StringBuilder();
            sb.append(s.getNum()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress() + ".");
            String s1 = sb.toString();
            bw.write(s1);
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }

    public static void addStu(ArrayList<Student> arrayList) {

        while (true) {
            boolean flag = false;
            System.out.print("输入学生学号:");
            Scanner sc = new Scanner(System.in);
            int inNum = sc.nextInt();

            for (int x = 0; x < arrayList.size(); x++) {
                Student s1 = arrayList.get(x);
                if (s1.getNum() == inNum) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println("学号重复,请重新输入.");
            } else {
                System.out.print("输入学生姓名:");
                Scanner sc2 = new Scanner(System.in);
                String inName = sc2.nextLine();

                System.out.print("输入学生年龄:");
                Scanner sc1 = new Scanner(System.in);
                int inAge = sc1.nextInt();

                System.out.print("输入学生地址:");
                Scanner sc3 = new Scanner(System.in);
                String inAdd = sc3.nextLine();

                Student testStu = new Student();
                testStu.setNum(inNum);
                testStu.setName(inName);
                testStu.setAge(inAge);
                testStu.setAddress(inAdd);

                arrayList.add(testStu);

                System.out.println("添加成功!");

                return;
            }
        }
    }
}
