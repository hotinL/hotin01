package myAPITest.hotin_3;

import java.util.Objects;

public class APIDemo_2 {
    public static void main(String[] args) {
        Student_1 s1 = new Student_1("张三",13);
        Student_1 s2 = new Student_1("张三",14);
        boolean isSame = s1.equals(s2);
        System.out.println(isSame);
    }
}

class Student_1 {
    String name;
    int age;

    public Student_1() {
    }

    public Student_1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void set() {
        System.out.println("set");
    }

//    @Override
//    public boolean equals(Object o) {
//        Student_1 s = (Student_1)o;
//        if (this == o) {
//            //优化性能
//            return true;
//        }
//        if (this.getClass() != s.getClass()) {
//            //加强鲁棒性
//            return false;
//        }
//        if (this.age != s.age) {
//            return false;
//        } else if (! this.name.equals(s.name)) {
//            return false;
//        }
//        return true;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student_1 student_1 = (Student_1) o;
        return age == student_1.age &&
                Objects.equals(name, student_1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

