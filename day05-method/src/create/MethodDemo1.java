package create;

public class MethodDemo1 {
    public static void main(String[] args) {
        //目標：掌握方法的完整定義格式
        //需求：求任意兩個整數和並返回
        //調用方法的格式 方法名（數據）
        int max =getMax(10,30);
        System.out.println(max);
    }
    public static int getMax(int a,int b){
        int max = a > b ? a : b;
        return max;
    }
}
