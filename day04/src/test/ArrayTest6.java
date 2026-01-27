package test;

public class ArrayTest6 {
    /*
    二維數組的遍歷使用
     */
    public static void main(String[] args) {
        int[][] arr = {
                {11,22},
                {33,44}
        };
        //外循環：遍歷二維數組，取出每一個一維數組
        for (int i = 0; i < arr.length; i++) {
            System.out.println( arr[i]);
            //内循環：繼續遍歷一維數組，取出每一個元素
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
