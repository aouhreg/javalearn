package array;

public class ArrayDemo6 {
    //[[I@f6f4d33  [[説明是二維數組，具體是存一維數組的内存地址
    public static void main(String[] args) {
        int[][] arr = {{11,22},{33,44}};
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1][1]);
    }
}
