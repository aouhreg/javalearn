package object;

import pojo.Student;

public class ObjectMethod {
    /*
    Object類：所有的類都直接，或者間接繼承了Object類

    成員方法：
    public String toString（）：返回對象的字符串表示形式

    細節：
    System.out.println():打印對象的時候，源碼中會自動調用該對象的toString方法

     public static String valueOf(Object obj) {
        return (obj == null) ? "null" : obj.toString();
    }
    Object類的toString方法，源碼

    對象的全類名@十六進制哈希值
    哈希值：對象的整數表示形式，常被人稱爲地址值
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

     */
    public static void main(String[] args) {
        Student student = new Student("j" ,20);
        System.out.println(student.toString());
        System.out.println(student);
    }
}
