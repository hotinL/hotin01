package myAPITest.hotin_3;

public class APIDemo_1 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",18);
        Student s2 = new Student("lisi",17);
        System.out.println(s1.toString());
        System.out.println(s1);
        System.out.println(s2.toString());
        
    }
}
class Student {
    private String name;
    private int age;

//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}