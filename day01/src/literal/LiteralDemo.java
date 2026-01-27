package literal;

public class LiteralDemo {
    //目標：學會字面量的書寫格式
    public static void main(String[] args) {
//        1.整數，小數
        System.out.println(123);
        System.out.println(9.9);

//        2.字符，必須單引號，有且僅有一個
        System.out.println('1');
        System.out.println('中');
        System.out.println(' ');
        // 特殊字符
        System.out.println("i'm" +'\t'+ 'J'); // \t一個tab空格
        System.out.println("i'm" +'\n'+ 'J'); // \n一個換行
//3.字符串
        System.out.println("");
        System.out.println("ilove");
        //4.tf
        System.out.println(true);
        System.out.println(false);
    }
}
