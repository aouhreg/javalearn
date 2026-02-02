package inner;

public class InnerDemo3 {
    /*
    局部内部類：定義在方法中的類，鷄肋語法，瞭解即可
     */

    public static void main(String[] args) {
        A a = new A();
        a.show();
    }
}


class A{
    public void show(){
        class B{
            public void print(){
                System.out.println("show class b print");
            }
        }

        B b = new B();
        b.print();
    }


}