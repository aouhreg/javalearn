package mabstract;

public class AbstractDemo1 {
    /*
    抽象類介紹：一種特殊的父類，内部可以編寫抽象方法

    抽象方法：共性的行爲（方法）抽取到父類之後，發現該方法的實現邏輯
    無法在父類中給出具體明確，該方法就可以定義爲抽象方法

    特點：强制要求子類重寫的方法
     */

    public static void main(String[] args) {

    }
}
abstract class Animal{
    public abstract void eat();
}

class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("cat eat fish");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("dog eat meat");
    }
}