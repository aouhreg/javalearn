package arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        //目標：掌握ArrayList集合的創建和使用

        //1.創建ArrayList集合的對象（代表一個容器 ）（是一個容器，大小可變，數據可以重複，有索引）
        ArrayList<String> list = new ArrayList(); //jdk7之後後面類型可以不屑
        list.add("acb");
        list.add("dfg");
        System.out.println(list);
        //2.插入數據

        list.add(1,"insert");
        System.out.println(list);

        //3.根據索引獲取數據： List = 【集合， HTML，Java增强】
        //
        String ele = list.get(2);
        System.out.println(ele);

        //4.獲取集合的大小（元素個數）
        System.out.println("獲取集合的大小:"+ list.size());
        //5.根據索引刪除數據，返回被刪除的數據 list = 【集合，HTML，java增强】
        list.remove(2);
        System.out.println(list);

        //6.直接刪除數據，返回真假
        System.out.println(
                list.remove("insert"));
        System.out.println(list);

        //7.修改某個索引位置處的數據

        System.out.println(list.set(0,"dev"));
        System.out.println(list);
    }
}
