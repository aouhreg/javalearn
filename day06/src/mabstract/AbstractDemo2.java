package mabstract;

public class AbstractDemo2 {
    /*
        抽象類注意事項
        1.抽象類不能實例化  實例就是對象的意思，實例化就是創建對象
            原因：如果允許創建對象，就可以調用抽象方法了，這樣做沒有意義
        2.抽象類不能創建對象，裏面還是存在構建方法
            原因：構造方法是交給子類通過super()調用的
        3.抽象類可以編寫普通的方法
            原因：子類可以直接繼承到這些方法使用
        4.抽象類的子類
            A重寫所有抽象方法
            B將子類改造爲抽象類
     */
    public static void main(String[] args) {
        //Fu f = new Fu()
        Zi z = new Zi();
        z.method();
    }
}

abstract class Fu {
    public Fu(){}

    public abstract void show();

    public void method(){
        System.out.println("method");
    }
}

class Zi extends Fu {
    public Zi(){
        super();
    }



    @Override
    public void show() {}
}

abstract class Zi2 extends Fu {
    public Zi2(){}
    //不推薦！！很麻煩。
}