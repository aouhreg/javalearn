package StringBuilder;

public class StringBuilderTest3 {
    public static void main(String[] args) {
        //目標：使用StringBuilder完成字符串的拼接操作

        //1.創建StringBuilder對象
        int[] input = {11,22,33,44};
        System.out.println(input);
        System.out.println(getArrayData(input));



        //
    }

    public static String getArrayData(int[] arr){
        if(arr == null || arr.length == 0){}
        StringBuilder s1 = new StringBuilder();
        s1.append("[");
        for (int i = 0; i < arr.length; i++) {
            s1.append(arr[i]).append(i == arr.length-1 ? "" : ",");
        }
        s1.append("]");
        return s1.toString();
    }
}
