package collection_travesal;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("上集合，下數組");

        String[] names = {"A", "B", "C", "D"};
        for (String name : names) {
            System.out.println(name);
        }
    }
}
