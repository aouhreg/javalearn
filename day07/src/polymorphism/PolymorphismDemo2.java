package polymorphism;

public class PolymorphismDemo2 {
    public static void main(String[] args) {
        //接口類型變量，指向了實現類對象（多態的形式創建對象）
        Inter inter = new InterImpl();
        inter.show();

    }
}

interface Inter{
    void show();
}

class InterImpl implements Inter{
    @Override
    public void show() {
        System.out.println("InterImpl after 's show");
    }
}