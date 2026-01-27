package create;

public class MethodDemo2 {
    public static void main(String[] args) {
        //目標：理解方法的其他定義格式
        printHelloWorld();
    }
    //方法如果不需要接受數據，形參列表可以不屑
    //方法如何不需要返回數據，返回值類型必須生命void
    //稱爲：無參數，無返回名方法
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
}
