package StringBuilder;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //目標：學會用StringBuilder,理解其好處
        //1.創建StringBuilder對象

        StringBuilder s1 = new StringBuilder(); // s1 = ""
        StringBuilder s2 = new StringBuilder("JL"); //s2 = "JL"
        System.out.println(s1);
        System.out.println(s2);

        //2.拼接内容 append
        s1.append("taipei").append(" ");
        s1.append(666);
        System.out.println(s1);

        //3.反轉内容 reverse
        s1.reverse();
        System.out.println(s1);

        //4。拿長度 length
        System.out.println(s1.length());

        //5.把StringBuilder 對象轉換成String對象
        //StringBuilder是拼接字符串的手段
        //String才是開發中的目的
        String result = s1.toString();
        System.out.println(result);
    }
}
