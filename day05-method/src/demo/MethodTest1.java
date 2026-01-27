package demo;

public class MethodTest1 {
    public static void main(String[] args) {
        //目標完成使用方法1-n和返回
        System.out.println( sum(5));
    }
    public static int sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
