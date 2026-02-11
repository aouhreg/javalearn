package collection_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionAPIDemo1 {
    public static void main(String[] args) {
        //目標：掌握Collection提供的常用方法：是全部單列集合都可以直接使用的。
        //多態
        //1.添加數據boolean add(E,e)
        Collection<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("A");
        System.out.println(list);//list = [A, B, C, D, E, A]

        //2.清空集合
        //list.clear()

        //3.判斷集合是否爲空 isEmpty()
        System.out.println(list.isEmpty());

        //4.直接刪除集合中的某個數據：默認只能刪除第一個數據
        list.remove("A");
        //5.判斷集合中是否包含某個數據contains
        System.out.println(list.contains("A"));

        //6.獲取集合的大小（元素個數） size()
        System.out.println(list.size());

        //7.把集合轉化成數組
        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));

        //8.擴展一下，把鄙人集合的數據加給自己

        Collection<String> c1 = new ArrayList<>();
        Collection<String> c2 = new ArrayList<>();
        c1.add("A");
        c1.add("adf");
        c2.add("B");
        c2.add("adf");
        c1.addAll(c2);
        System.out.println(c1);
        System.out.println(c2);

        //


    }
}
