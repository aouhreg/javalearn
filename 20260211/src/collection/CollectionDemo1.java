package collection;

import pojo.Student;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    /*
    Collection常用成員方法
        add添加clear清空
        remove刪除
        conatains判斷是否有給定的對象
        isEmpty集合是否爲空
        size（）長度個數
     */
    public static void main(String[] args) {
        Collection<Student> c = new ArrayList();
        c.add(new Student("Jack", 18));
        c.add(new Student("jay", 19));
        c.add(new Student("Jac", 18));
        c.add(new Student("Jac", 30));
        System.out.println(c.contains(new Student("Jack", 18)));

        c.remove(new Student("Jack", 18));
        System.out.println(c.contains(new Student("Jack", 18)));

    }
    public static void method(){
        //使用多態形式創建集合對象
        Collection<String> c = new ArrayList<String>();
        boolean b1 = c.add("j");
        boolean b2 = c.add("jl");
        boolean b3 = c.add("k");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(c);
        System.out.println(c.contains("A"));
        //根據索引刪除是list派系的方法不是共有方法
        boolean result = c.remove("A");
        //System.out.println(result);
        System.out.println(c);
        System.out.println(c.contains("A"));

        System.out.println(c);
        System.out.println(c.size());
        System.out.println(c.isEmpty());

        c.clear();
        System.out.println(c);
        System.out.println(c.size());
        System.out.println(c.isEmpty());
    }
}
