package bigdecimal;

import java.math.BigDecimal;

public class BigDecimalDemo1 {
    //目標：學會處理浮點型運算失真的問題
    public static void main(String[] args) {

        double a = 0.1;
        double b = 0.2;
        double c = a+ b;

        System.out.println(c);

        //1.把兩個數據包裝成BigDecimal對象
        //public BigDecimal(String val)：這個接收字符串的構造器才可以處理失真問題
        BigDecimal a1 = new BigDecimal(Double.toString(a));
        BigDecimal b1 = new BigDecimal(Double.toString(b));

        //b。阿里巴巴公司更推薦我們用valueOf方法包裝浮點型數據成爲BigDecimal對象
        //跟上面是一樣
        BigDecimal a11 = BigDecimal.valueOf(a);
        BigDecimal b11 = BigDecimal.valueOf(b);

        //2.調用方法進行精度預算

        //BigDecimal c11 = a11.add(b11);
        //BigDecimal c12 = a11.subtract(b11);
        //BigDecimal c13 = a11.multiply(b11);
        BigDecimal c11 = a11.divide(b11);


        //3.BigDecimal是處理精度問題的手段，結果必須還是基本類型的
        double result = c11.doubleValue();
        System.out.println(result);

        BigDecimal i = BigDecimal.valueOf(0.1);
        BigDecimal j = BigDecimal.valueOf(0.3);
        BigDecimal k = i.divide(j, 2, BigDecimal.ROUND_HALF_UP);
        System.out.println(k);
    }
}
