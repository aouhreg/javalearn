package string;

public class StringDemo1 {
    //目標：掌握String創建字符串對象，封裝字符串數據的方法
    //1.方式一：直接内容就可以得到字符串對象，封裝字符串數據了。 推薦方法
    String name = "jl";

    //2.方法二：通過調用構造器初始化字符串對象，封裝字符串數據（瞭解即可）
    String s1 = new String("jl");

    public static void main(String[] args) {
        String s0 = new String();
        String s1 = new String("jl");
        System.out.println(s1);

        char[] chars = {'a', 'b', 'c'};
        String s2 = new String(chars);
        System.out.println(s2);

        byte[] bytes = {97, 98, 99};
        String s3 = new String(bytes);
        System.out.println(s3);
    }

}
