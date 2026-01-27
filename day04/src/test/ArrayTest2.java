package test;

public class ArrayTest2 {
    //需求，已知數組元素為{5，44，33，55，22}請找出最大值
    public static void main(String[] args) {
        int [] arr= {-5,-44,-33,-55,-22};
        System.out.println(getMax(arr));
    }
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
