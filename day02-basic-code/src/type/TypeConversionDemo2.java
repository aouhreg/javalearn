package type;

public class TypeConversionDemo2 {
    public static void main(String[] args) {
        //目標：表達式的自動類型轉換
        byte a =10;
        int b =20;
        long c =30;
        long result = a+b+c;
        System.out.println(result);

        double result2 =a + b + 3.14;
        System.out.println(result2);

        byte a1 = 10;
        byte a2 = 30;
        //byte a3 = a1 + a2;//wrong在表達式中byte,short char直接轉換成int類型進行運算
        int a3 = a1 + a2;
        System.out.println(a3);
    }
}
