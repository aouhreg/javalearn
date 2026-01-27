package mextends;

import org.w3c.dom.ls.LSOutput;

public class ExtendsDemo4 {
    public static void main(String[] args) {
        methodC c = new methodC();
        c.methodA();
        c.methodB();
        c.methodC();
    }
}
class methodA{
    public void methodA(){
        System.out.println("methodA");
    }
}

class methodB extends methodA{
    public void methodB(){
        System.out.println("methodB");
    }
}
class methodC extends methodB{
    public void methodC(){
        System.out.println("methodC");
    }
}