package polymorphism;

public class PolymorphismDemo1 {
    /*
    多態的前提
    1.繼承|實現關係
    2。重寫方法
    3.父類引用指向子類對象

   多態的成員訪問特點：
   成員變量：編譯看左邊（父類），運行看左邊（父類） 因爲是父類的引用，所以訪問存在的局限性，只能訪問super空間中的數據。
    成員方法：編譯看左邊（父類），運行看右邊（子類）
    編譯時檢查方法在父類中是否存在
    不存在：編譯出錯
    存在：編譯通過，但運行的時候一定會執行子類的方法邏輯

    靜態成員：編譯看左邊(父類），運行看左邊（父類）
    static修飾的成員，推薦使用類名調用
    f.show() -->字節碼文件--> Fu.show
     */
    public static void main(String[] args) {
        //子類引用，指向子類對象
        Zi zi = new Zi();
        System.out.println(zi.num);
        zi.show();
        //父類引用，指向子類對象（以多態的形式創建對象）
        Fu fu = new Zi();
        fu.show();
        System.out.println(fu.num);
    }
}

class Fu{
    int num = 10;
    public static void  show(){
        System.out.println("Fu show");
    }
}

class Zi extends Fu{
    int num = 20;


    public  static void show(){
        System.out.println("Zi show");
    }
}