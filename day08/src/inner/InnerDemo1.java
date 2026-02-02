package inner;

public class InnerDemo1 {
    /*
    内部類創建對象的格式：

    外部類名.内部類名 對象名 = new 外部類對象().new 内部類對象();

    訪問特點：
        内部類訪問外部類：直接訪問
        外部類訪問内部類：需要創建對象訪問
     */
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        System.out.println(oi.a);
        oi.show();
    }
}

class Outer{

    private int num = 100;

    public void method(){
        System.out.println("methods");
    }

    public void function(){
        Inner i = new Inner();
        System.out.println(i.a);
        i.show();
    }

    class Inner{
        int a = 10;

        public void show(){
            System.out.println("Inner show");
        }

        public void print(){
            System.out.println(num);
            method();
        }
    }
}