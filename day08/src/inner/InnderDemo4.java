package inner;

public class InnderDemo4 {
    /*
    問題：調用方法時，方法的形參是接口，我們該傳入的是什麽？
    回答：需要傳入接口的實現類對象

    復盤：調用這個方法
    1.編寫實現類，實現接口
    2.重寫方法
    3.創建實現類對象，將對象作爲參數傳入

    匿名内部類就可以處理這個
     */

    public static void main(String[] args) {
        useInter(new Interlmpl());
    }
    public static void useInter(Inter i){
        i.show();
    }
}

interface Inter{
    void show();
}

class Interlmpl implements Inter{
    @Override
    public void show() {
        System.out.println("impelement interlmpl override show function");
    }
}