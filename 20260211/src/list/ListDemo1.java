package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        //目標：掌握list的特有方法

        //1.創建list的集合(一行經典代碼)
        List<String> list = new ArrayList<String>();
        list.add("java1");
        list.add("java2");
        list.add("java3");

        //2.給某個位置插入一個數據

        list.add(2,"frton");
        System.out.println(list);

        //3.根據索引刪除數據
        System.out.println(list.remove(2));
        //4.修改索引位置処的數據
        list.set(0,"c");
        System.out.println(list);
        //5.根據索引獲取數據
        System.out.println(list.get(0));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for(String s : list) {
            System.out.println(s);
        }

        list.forEach(System.out::println);

    }
}
