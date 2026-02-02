package inner;

public class InnerDemo2 {
    /*
    靜態内部創建對象格式：

    格式：外部類名.内部類名 對象名 = new 外部類名.内部類對象（）；
     */

    public static void main(String[] args) {
        Myouter.Inner mi = new Myouter.Inner();
        mi.show();
        Myouter.Inner.method();
    }
}

class Myouter{
    static class Inner{
        public void show(){
            System.out.println("Inner show");
        }

        public static void method(){
            System.out.println("Inner method");
        }
    }
}