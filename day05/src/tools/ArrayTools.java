package tools;

/**
 * 這是一個數組的工具類，内部提供了很多數組的便携操作
 * 求最大，最小，遍歷打印
 * @version 1.0
 * @author jl
 */
public class ArrayTools {
    private ArrayTools(){}

    /**
     * 此方法可以從傳入的數組中找到最大值並返回
     * @param arr 需要求最大值的數組
     * @return 返回找到最大值
     */
    public static int getMax(int[] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max)max = arr[i];
        }
        return max;
    }

    /**
     *
     * @param arr
     * @return
     */
    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min)min = arr[i];
        }
        return min;
    }

    /**
     * loop to print all element
     * @param arr
     */
    public static void show(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
