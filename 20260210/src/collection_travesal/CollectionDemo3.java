package collection_travesal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo3 {
    public static void main(String[] args) {
        //目標：掌握Collection集合的遍歷方法三：lambda表達式
        Collection<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

//        list.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        list.forEach(System.out::println);
    }
}
