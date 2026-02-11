package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CollectionDemo1 {
    public static void main(String[] args) {
        //目標：簡單認識Collection集合的家族特點
        //1.List家族特點：有序，可重複，有索引
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("A");

        System.out.println(list);

        //2.Set家族特點：無序，不重複，無索引

        HashSet<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");
        System.out.println(set);
    }
}
