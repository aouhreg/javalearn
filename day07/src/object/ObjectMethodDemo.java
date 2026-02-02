package object;

import pojo.Student;

public class ObjectMethodDemo {
    /*
    ==
    1.基本數據類型：比較數據值
    2.引用數據類型，比較地址值
    Object類中equals方法默認也是比較地址值
    public boolean equals(Object obj) {
        return (this == obj);
    }
    結論：推薦重寫equals方法，自己定制比較規則


     */
    public static void main(String[] args) {
        Student stu1 = new Student("js",12);
        Student stu2 = new Student("j",12);

        System.out.println(stu1 == stu2);
        //  == 比較的是地址值

        System.out.println(stu1.equals(stu2));
    }


}
