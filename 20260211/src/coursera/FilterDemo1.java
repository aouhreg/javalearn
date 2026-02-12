package coursera;

public class FilterDemo1 {

     // 用“埃氏筛法”求2～10000以内的素数。2～10000以内的数，
     // 先去掉2的倍数，再去掉3的倍数，再去掉4的倍数，……依此类推，最后剩下的就是素数。
     //要求使用数组，使用数组的长度，使用增强的for语句
     public static void main(String[] args) {
         int n = 10000;

         boolean[] isPrime = new boolean[n+1];
        //1.初始化數組，因爲預設是false，要改爲true
         for (int i = 0; i < isPrime.length; i++) {
             isPrime[i] = true;
         }

         //2.核心

         for (int i = 2; i*i <= n; i++) {
             if (isPrime[i]) {
                 for (int j = i*i; j < n; j += i) {
                     isPrime[j] = false;
                 }
             }
         }

         //3.foreach展示
         int count = 0;
         int number = 2;
         for(boolean b: isPrime) {
             if(b){
                 count++;

                 System.out.println(number);
             }
             number++;
         }
         System.out.println(count);



     }
     public static boolean isPrime(int n) {
         for (int i = 2; i < n; i++) {
             if (n % i == 0) {
                 return false;
             }
         }
         return true;
     }
}
