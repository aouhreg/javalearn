package constructor;


public class Test {
    /*
    在子類所有的構造方法中，第一句話默認隱藏了super():
    訪問弗雷的空參數構造方法從而完成父類的初始化操作。
     */
    public static void main(String[] args) {
        Zi z1 = new Zi();
        Zi z2 = new Zi(10);


    }
}
class Fu{
    public Fu(){
        System.out.println("Fu類空參數構造方法");
    }
    public Fu(int num){
        System.out.println("Fu類帶參數構造方法");
    }

}

class Zi extends Fu{
    public Zi(){
        super();
        System.out.println("Zi類空參數構造方法");
    }
    public Zi(int num){
        super(num);
        System.out.println("Zi類帶參數構造方法");
    }
}
