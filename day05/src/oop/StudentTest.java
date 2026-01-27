package oop;

public class StudentTest {
    //測試類：帶有main方法的類

    /*
    細節補充：
    1.成員變量就算沒有賦值，也可以使用，使用的是默認值
    2.打印對象名，看到的是内存地址
    oop.Student@23fc625e

    oop.Student:全類名 包+類名
     */
    public static void main(String[] args) {
         //創建對象：類名 對象名 = new 類名();
        Student stu1 = new Student();
        System.out.println(stu1);
        //使用對象：對象名.變量名；對象名.方法名（）；
        stu1.age = 23;
        stu1.name = "jsdf";
        System.out.println(stu1.age);
        System.out.println(stu1.name);
        stu1.eat();
        stu1.study();

        Student stu2 = new Student();
        System.out.println(stu2.age);
        System.out.println(stu2.name);
        stu2.eat();
        stu2.study();
    }
}
