package test;

import pojo.Student;

public class StudentTest {
    public static void main(String[] args) {
        //1.使用無參數構造方法創建對象，通過setXXX方法賦值
        Student stu1 = new Student();

        stu1.setAge(12);
        stu1.setName("j");

        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());

        //2.使用帶參數構造方法創建對象，在創建都西昂的過程中直接賦值
        Student stu2 = new Student("jj", 23);
        System.out.println(stu2.getAge());
        System.out.println(stu2.getName());

        //思路：getXXX方法是能夠拿到真實的數據，數據到手幹什麽都行
        for (int i = 0; i < stu2.getAge(); i++) {
            System.out.println("h");
        }
    }
}
