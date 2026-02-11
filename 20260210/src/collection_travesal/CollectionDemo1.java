package collection_travesal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1 {
    public static void main(String[] args) {
        //目標：掌握Collection集合的便利方式一：迭代器
        Collection<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);

        //1.得到集合的迭代器對象
        Iterator<String> it = list.iterator();
        //2.可以通過迭代器遍歷數據
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//
         //3.使用循環遍歷
        while(it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }

    }
}
