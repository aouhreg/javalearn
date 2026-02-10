package string;

import java.util.Random;

public class StringTest5 {
    public static void main(String[] args) {
        //目標String開發驗證碼

        System.out.println(create(5));
        System.out.println(create(8));;
    }
    public static String create(int n){
        String code = "";
        String data = "abcdefgWAEGWERGAE!@#!@123124";
        //1.直接循環使用隨機獲取多少位并返回
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            //2.隨機產生一個索引
            int index = random.nextInt(data.length());
            //3.提取對應索引的字符
            char c = data.charAt(index);
            //4.拼接
            code += c;
        }

        return code;
    }

}
