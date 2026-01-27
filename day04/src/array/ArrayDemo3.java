package array;

public class ArrayDemo3 {
    public static void main(String[] args) {
        /*
        解決代碼過於臃腫，相似度很高，
        優化：使用循環來進行優化。

        數組的通用遍歷方式：
        int[] arr = {11,22,33,44,55};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        數組名.fori + 回車

         */


        int[] arr = {11,22,33,44,55};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
