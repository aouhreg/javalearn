package mfinal;

public class FinalTest {
    /*
    final關鍵字：可以修飾方法，類，變量

    方法：被修飾的方法，不能被重寫
    類：被修飾的類，不能被繼承
    變量：被修飾的變量，會變成常量

    基本數據類型變量：數據值不可改變
    引用數據類型變量：地址值不可改變

    final修飾成員變量，初始化實際
    1.在定義的時候完成賦值
    2.在構造方法結束之前玩造成賦值

    --------------

    final修飾的變量就變成了常量，常量的命名規範
    1.如果是一個單子：所有字母大寫 MAX
    2.如果是多個單子：所有字母大寫，中間使用_分割 MAX_VALUE
     */
    public static void main(String[] args) {
        Zi zi = new Zi();
        final int num = 10;
        final int[] arr = {11,22,33};
        //arr = new int[];
        arr[0] = 66;
        System.out.println(arr[0]);

    }
}

final class Fu extends Object{
    public  void method1(){
        System.out.println("it's important's method use final and don't advise");
    }
    public  void method2(){
        System.out.println("it's important's method use final and don't advise");
    }
    public  void method3(){
        System.out.println("it's important's method use final and don't advise");
    }
    public  void method4(){
        System.out.println("it's important's method use final and don't advise");
    }
}

class A {
    final int num;

    public A(int num) {
        this.num = num;
    }
}

class Zi {

}