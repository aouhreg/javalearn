package minterface;

public class InterfaceDemo1 {
    /*
    1。接口介紹
    體現的思想是對規則的生命

    2.接口定義和使用
    接口用關鍵字interface來定義
    接口和類之間是實現關係，通過implements關鍵字來表示
     */
    public static void main(String[] args) {
        Inter i = new InterImpl();
        i.method();
        i.show();
    }

}

interface Inter{
    public abstract void show();
    public abstract void method();
}
/*
接口定義好就代表把規則定義好了
 */

/*
1.重寫所有抽象方法
2.要麽是抽象類 bijioa manfan

extends 認親爹 implements認乾爹
 */
class InterImpl implements Inter{
    @Override
    public void show() {
 System.out.println("show after interface");
    }

    @Override
    public void method() {
        System.out.println("method after interface");
    }
}
