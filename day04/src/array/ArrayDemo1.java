package array;

public class ArrayDemo1 {
    /*
    數組靜態初始化格式：
    1.完整類型
    數組類型【】 數組名 = new 數據類型【】{元素1，元素2，元素3}；
    2.簡化格式
    數據類型【】數組名= {元素1，元素2，元素3}；

    [I@f6f4d33
    細節，打印數組名，看到的不是數組内容，而是數組的十六進制内存地址


    [I@f6f4d33

    @：分隔符
    【：當前的空間是數組類型
    I：數組中元素的類型
    f6f4d33：十六進制地址值
     */
    public static void main(String[] args) {
        int[] arr1 = new int[]{11,22,33};
        double[] arr2 = {11.1,2,33.3};

        System.out.println(arr1);
        System.out.println(arr2);
    }

}
