package minterface;

public class InterfaceDemo4 {
    /*
    接口新特性：
    jdk8：接口中可以定義有方法體的方法（默認，靜態
    jdk9：接口中可以定義私有方法
     */
    public static void main(String[] args) {
        OrderServiceImplA a = new OrderServiceImplA();
        a.create();
        a.cancel();
        a.pay();

        OrderServiceImplB b = new OrderServiceImplB();
        b.create();
        b.cancel();
        b.pay();
        OrderService.print();
    }
}

interface OrderService{
    void create();
    void cancel();

    default void pay(){
        System.out.println("pay");
    }

    static void print(){
        System.out.println("OrderService.static print");
    }
}

class OrderServiceImplA implements OrderService{
    @Override
    public void create() {}

    @Override
    public void cancel() {}
}

class OrderServiceImplB implements OrderService{
    @Override
    public void create() {}

    @Override
    public void cancel() {}
}

interface TestA{
     default void show(){
        System.out.println("test a show");
    }
}

interface TestB{
     default void show(){
        System.out.println("test b show");
    }
}

class TestABImpl implements TestA,TestB{
    @Override
    public void show() {
        TestA.super.show();
    }
}