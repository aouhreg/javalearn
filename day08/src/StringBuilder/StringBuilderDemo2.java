package StringBuilder;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        //目標：進行StringBuilder拼接字符串性能測試
        //1.String拼接看雄安率
        String s = "";
        for (int i = 0; i < 100000; i++) {
            s = s + "abc";
        }
        System.out.println(s);



        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < 100000000; i++) {
            s1.append("abc");
        }
        System.out.println(s1);
    }
}
