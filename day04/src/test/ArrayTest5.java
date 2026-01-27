package test;

import java.util.Scanner;

public class ArrayTest5 {
    public static void main(String[] args) {
    //1.鍵盤錄入6個分數
    //2.找出最大最小
    //3.求平均輸出
        int arr[] = initData();
        System.out.println(avg(arr,findMax(arr),findMin(arr)));
    }
    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max)max=arr[i];
        }
        return max;
    }
    public static int findMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min)min = arr[i];
        }
        return min;
    }
    public static double avg(int[] arr, int min, int max){

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (sum - min-max)/ (arr.length -2  * 1.0);
        return avg;
    }
    public static int[] initData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("input 6");
        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            int score = sc.nextInt();
            if(score>0 && score<100){
                arr[i] = score;
                System.out.println(i+" is"+ arr[i]);
            }
            else{
                System.out.println("wrong input,renew" + i);
                i--;
            }
        }
        return arr;
    }
}
