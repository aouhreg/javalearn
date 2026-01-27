package template;

public class Test {
    /*
    設計模式：一些優秀程序員總結出來的經驗

    模板設計模式：將抽象類整體看作爲是一個模板，模板中不能決定的内容，定義為抽象方法
    讓使用個模板的類，補齊抽象方法的邏輯
     */
    public static void main(String[] args) {
        Tony tony = new Tony();
        tony.write();
        Tom tom = new Tom();
        tom.write();

    }
}
