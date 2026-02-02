package minterface;

public class InterfaceDemo3 {
    /*
    接口和類的關係：實現關係，可以單實現，也可以多實現，甚至可以繼承一個類的同時，實現多個接口
    接口和接口的關係：繼承關係，可以單繼承，也可以多繼承
     */
    public static void main(String[] args) {

    }
}

interface A{
    void method();
}
interface B{
    void method();
}
interface C extends A,B{
    void method();
}

class CImpl implements C{
    @Override
    public void method() {

    }
}


class Fu{
    public void show(){
        System.out.println("FUshow");
    }
}

interface InterA{
    void show();
}

interface InterB{
    void show();
}

class InterABImpl extends Fu implements InterA,InterB{


}


