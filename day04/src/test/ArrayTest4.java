package test;

public class ArrayTest4 {
    public static void main(String[] args) {
        int arr[] = {11,22,33,44,55};
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    //需求對數組中的元素反轉
    public static void swap(int [] arr){
        //第一個元素arr【0】
        //最後一個元素arr【arr.length -1】
        int start = 0,end = arr.length -1;
        int temp = 0;

    }
    public static void reverseArray(int[] arr){
        for (int start = 0, end = arr.length -1; start < end; start++,end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
}
