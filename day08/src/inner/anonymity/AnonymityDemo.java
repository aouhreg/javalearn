package inner.anonymity;

public class AnonymityDemo {
    /*
    匿名内部類：本質上來説是一種特殊的局部内部類

    使用前提：需要存在一個類，或者接口

    new類名（）{} -->繼承這個類
    new接口（）{} -->實現這個接口


    匿名内部類：常用於方法的傳遞。

    但是不建議傳統的實現類，如果抽象方法太多的話，還是用傳統比較簡潔
     */
    public static void main(String[] args) {
        //匿名内部類對象
        new Fu(){
            @Override
            public void method() {
                System.out.println("匿名内部類重寫后的method方法.");
            }
        }.method();
        //1.實現接口 2.重寫方法 3.創建實現類對象
        new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部類重寫后的接口方法實現");
            }
        }.show();

        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("<UNK>show<UNK>");
            }
        });
        /*
        Inter i  = new Inter() {
            @Override
            public void show() {
                System.out.println("<UNK>show<UNK>");
            }
        };

        Inter i = Inter接口的實現類對象。我們是使用匿名内部類創造出來。

         */
    }

    public static void useInter(Inter i){
        i.show();
    }
}

class Fu{
    public void method(){
        System.out.println("Fu...method..");
    }
}

interface Inter{
    void show();
}
