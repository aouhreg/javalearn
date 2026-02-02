package object;

import pojo.Person;

import java.util.Objects;

public class ObjectsDemo {
    /*
    public static boolean isNull(Object obj):判斷變量是否為null；
    public static boolean equals(object a, object b):比較兩個對象是否相同
    -底層依賴於我們自己重寫的equals方法。
    -會幫我們進行非空判斷。
    -程序不會直接崩潰。

    a = p1
    b = p2

     public static boolean equals(Object a, Object b) {
        return (a == b) || (a != null && a.equals(b));
    }
    if(a == b)return ture
    if(a!=null)return a.equals(b)
    else return false

     */
    public static void main(String[] args) {
        Person p1 = new Person("h",1);
        Person p2 = new Person("h",1);
        System.out.println(Objects.isNull(p1));
        System.out.println(Objects.isNull(p2));
        System.out.println(Objects.equals(p1, p2));
    }
}
