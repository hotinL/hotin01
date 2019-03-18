package myAPITest.hotin_2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class IOStuMane {
    public static void main(String[] args) throws IOException{
        String fileName = "Student.txt";

        while (true) {
            System.out.println("-------------------------------------");
            System.out.println("---------- 学生信息管理系统 ---------");
            System.out.println("---------- 1. 学生信息添加  ---------");
            System.out.println("---------- 2. 学生信息查找  ---------");
            System.out.println("---------- 3. 学生信息删除  ---------");
            System.out.println("---------- 4. 学生信息修改  ---------");
            System.out.println("---------- 5. 退出学生系统  ---------");
            System.out.println("-------------------------------------");
            Scanner sc = new Scanner(System.in);
            System.out.print("请选择你的操作:");
            int index = sc.nextInt();

            switch (index) {
                case 1: {
                    addStu(fileName);
                    break;
                }
                case 2: {
                    findStu(fileName);
                    break;
                }
                case 3: {
                    deleStu(fileName);
                    break;
                }
                case 4: {
                    setStu(fileName);
                    break;
                }
                case 5: {

                }
                default: {
                    System.exit(0);
                }
            }
        }
    }


    private static void addStu(String fileName) throws IOException {
        //addStu(文件名)
        /*
        * 实现重复学号的检测
        * */
        while(true) {
            ArrayList<Student> arrStu = new ArrayList<>();
            //创建对象链表
            read(fileName,arrStu);
            //read(文件名,链表名)

            //识别符
            boolean isSame = false;

            //学号
            System.out.print("输入学生学号:");
            Scanner sc = new Scanner(System.in);
            int inNum = sc.nextInt();

            for (int x = 0; x < arrStu.size(); x++) {
                Student checkStu = arrStu.get(x);
                int checkNum = checkStu.getNum();
                if (inNum == checkNum) {
                    isSame = true;
                    break;
                }
            }

            if (isSame) {
                System.out.println("学号重复,请重新输入");
            } else {
                //姓名
                System.out.print("输入学生姓名:");
                Scanner sc1 = new Scanner(System.in);
                String inName = sc1.nextLine();

                //年龄
                System.out.print("输入学生年龄:");
                Scanner sc2 = new Scanner(System.in);
                int inAge = sc1.nextInt();

                //地址
                System.out.print("输入学生地址:");
                Scanner sc3 = new Scanner(System.in);
                String inAdd = sc3.nextLine();

                //创建学生对象接收数据,实例化对象
                Student addStu = new Student();
                addStu.setNum(inNum);
                addStu.setName(inName);
                addStu.setAge(inAge);
                addStu.setAddress(inAdd);

                //将学生对象添加到数组
                arrStu.add(addStu);

                write(fileName,arrStu);
                System.out.println("添加成功!");
                return;
            }
        }
    }

    private static void findStu(String fileName) throws IOException {
        /*
        * 遍历对象数组
        * */
        ArrayList<Student> arrStu = new ArrayList<>();
        read(fileName,arrStu);

        //arrStu.size() == 0 --> 数组为空;
        if (arrStu.size() == 0) {
            System.out.println("查询为空!");
        } else {
            //\t --> 分隔符
            System.out.println("学生学号\t\t姓名\t年龄\t地址");

            for (int x = 0; x < arrStu.size(); x++) {
                Student forStu = arrStu.get(x);
                System.out.println(forStu.getNum() + "\t\t\t" + forStu.getName() + "\t" + forStu.getAge() + "\t\t" + forStu.getAddress());
            }
        }
    }

    private static void deleStu(String fileName) throws IOException {
        /*
        * 检测学号是否为空
        * */
        ArrayList<Student> arrStu = new ArrayList<Student>();
        read(fileName,arrStu);

        //标识符
        int index = -1;

        System.out.println("请输入删除学生学号:");
        Scanner sc = new Scanner(System.in);
        int delNum = sc.nextInt();

        for (int x = 0; x < arrStu.size(); x++) {
            Student findStu = arrStu.get(x);
            int findNum = findStu.getNum();
            if (delNum == findNum) {
                index = x;
                break;
            }
        }
        if (index != -1) {
            arrStu.remove(index);
            write(fileName,arrStu);
            System.out.println("删除成功!");
        } else {
            System.out.println("查询为空!");
        }
    }

    private static void setStu(String fileName) throws IOException{
        /*
         * 检测学号是否为空
         * */
        ArrayList<Student> arrStu = new ArrayList<Student>();
        read(fileName,arrStu);

        //标识符
        int index = -1;


        System.out.println("请输入修改学生学号:");
        Scanner sc = new Scanner(System.in);
        int setNum = sc.nextInt();

        for (int x = 0; x < arrStu.size(); x++) {
            Student findStu = arrStu.get(x);
            int findNum = findStu.getNum();
            if (setNum == findNum) {
                index = x;
                break;
            }
        }

        if (index != -1) {
            System.out.print("输入学生姓名:");
            Scanner sc1 = new Scanner(System.in);
            String reName = sc1.nextLine();

            System.out.print("输入学生年龄:");
            Scanner sc2 = new Scanner(System.in);
            int reAge = sc2.nextInt();

            System.out.print("输入学生地址:");
            Scanner sc3 = new Scanner(System.in);
            String reAdd = sc3.nextLine();

            Student chaStu = arrStu.get(index);
            chaStu.setAge(reAge);
            chaStu.setName(reName);
            chaStu.setAddress(reAdd);

            write(fileName,arrStu);
            System.out.println("修改成功!");
        } else {
            System.out.println("查询为空!");
        }
    }


    private static void read(String fileName,ArrayList<Student> arrayList) throws IOException {
        //read(fileName,arrayList) --> (文件名,链表名)参数传递
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        //创建字符缓存流对象
        String str;

        while ((str = br.readLine()) != null) {
            String[] strs = str.split(",");
            Student stu = new Student();
            stu.setNum(Integer.valueOf(strs[0]));
            stu.setName(strs[1]);
            stu.setAge(Integer.valueOf(strs[2]));
            stu.setAddress(strs[3]);
            arrayList.add(stu);
        }
        br.close();
    }

    private static void write(String fileName,ArrayList<Student> arrayList) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));

        for (int x = 0; x < arrayList.size(); x++) {
            Student stu = arrayList.get(x);
            StringBuilder sb = new StringBuilder();
            sb.append(stu.getNum()).append(",").append(stu.getName()).append(",") .append(stu.getAge()).append(",").append(stu.getAddress());
            String s = sb.toString();
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        bw.close();

    }
}
