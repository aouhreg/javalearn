package type;

public class TypeConversionDemo1 {
    public static void main(String[] args) {
        //目標：理解類型轉換-自動類型轉換
        byte a = 12;
        int b = a; //自動類型轉換
        System.out.println(a);
        System.out.println(b);

        int i = 999;
        double j = i;
        System.out.println(i);
        System.out.println(j);

        char ch = 'b';
        int it = ch;
        System.out.println(ch);
        System.out.println(it);

    }
}
