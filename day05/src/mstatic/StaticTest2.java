package mstatic;

public class StaticTest2 {
    /*
    static注意事項：
    1.static中只能訪問靜態成員（直接訪問）
    2.static中沒有this關鍵字
     */

    int num = 10;
    static int staticnum =20;
    public static void main(String[] args) {
        StaticTest2 t = new StaticTest2();

        System.out.println(t.num);
        t.method();
        method();
    }

    public static void method(){
        System.out.println("method");
    }
}
