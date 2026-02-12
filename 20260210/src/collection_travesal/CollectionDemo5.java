package collection_travesal;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo5 {
    public static void main(String[] args) {
        //目標：理解三種遍歷的區別
        //1.集合的并發修改異常,以遍歷刪除爲例

        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("B");
        list.add("C");
        list.add("DB");
        list.add("E");
        list.add("B");
        System.out.println(list);
//
//        for (int i = 0; i < list.size(); i++) {
//            String name = list.get(i);
//            if(name.contains("B")){
//                list.remove(name);
//            }
//        }
//        System.out.println(list);

        //2.迭代器遍歷並刪除：爆出一個并發修改異常的錯誤
//
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            String name =  it.next();
//            if(name.contains("B")) {
//                //list.remove(name);ConcurrentModificationException 如果用集合的方法刪除，還是出錯。
//                it.remove();//使用迭代器自己的刪除方法，刪除當前迭代器遍歷到的數據，就不會出現bug
//            }
//            System.out.println(list);
//        }
        //3.增强for能不能遍歷刪除？不可以的，他本事迭代器的簡化版寫法，沒有辦法直接用迭代器的刪除方法刪除數據
//        for (String s : list) {
//            if(s.contains("B"))
//            {
//                list.remove(s);
//            }
//        }
//        System.out.println(list);

        //4.lambda是否可以遍歷並刪除？不可以的，因爲他的底層就是基於增强for遍歷
        list.forEach(i-> {
            if(i.contains("B"))
            {
                System.out.println(i);
                list.remove(i);
            }
        });
        System.out.println(list);

    }
}
