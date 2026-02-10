package StringJoiner;

import java.util.StringJoiner;

public class StringJoinerTest3 {
    public static void main(String[] args) {
        //目標：使用StringJoiner完成字符串的拼接操作

        //1.創建StringJoiner對象
        int[] input = {11,22,33,44};
        System.out.println(input);
        System.out.println(getArrayData(input));



        //
    }

    public static String getArrayData(int[] arr){
        if(arr == null || arr.length == 0){}
        //參數一：間隔符，參數二，開始符號，參數三：結束符號
        StringJoiner s1 = new StringJoiner(", ","[","]");

        for (int i = 0; i < arr.length; i++) {
            s1.add(Integer.toString(arr[i]));
        }
        return s1.toString();
    }
}
