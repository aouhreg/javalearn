package test;

public class ArrayTest {
    public static void main(String[] args) {

        int[] arr = {11,22,33,44,55};

        int[] arr2 = {11,22,33,44,55,12932193,123,2};
        System.out.println(getSun(arr2));
    }
    public static int getSun(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //arr[i]：每一個元素
            // i： 代表索引
            if(arr[i] % 2 == 0)
                sum += arr[i];
        }
        return sum;
    }
}
