package array;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,5};
        // output22
        System.out.println(arr[1]);
        //advice index= 1 = 66
        arr[0] = 66;
        System.out.println(arr[0]);
        //judge array[2]is even or odd
        if(arr[2] % 2 == 0){
            System.out.println(arr[2] + "even");
        }
        else{
            System.out.println(arr[2] + "odd");
        }
        //by arr[last] print hw
        for (int i = 0; i < arr[arr.length-1]; i++) {
            System.out.println("hw");
        }
        System.out.println(arr.length);
    }
}
