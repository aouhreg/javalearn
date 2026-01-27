package array;

import java.util.Random;

public class ArrayDemo5 {
    /*
    數組初始化
    1.靜態初始化：手動指定元素，系統計算出數組的長度
    int[] arr = {11,2,3,4}; arr.length
    使用場景：要操作的數據，需求中已經明知了
    舉例：已知班級學生成績為90，100，20，30，找出最大值

    2.動態初始化:手動指定長度，系統會分配默認初始化
    int[] arr = new int[3];
    使用場景：不明確要操作的數據
    舉例：產出10個1~100之間的隨機數，找出最大值。
    int[] arr ={?????};

     */
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100 ) + 1;
            if(arr[i] > max)
                max = arr[i];
            System.out.println(arr[i]);
        }
        System.out.println(max);

    }
}
