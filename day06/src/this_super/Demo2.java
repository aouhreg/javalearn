package this_super;

public class Demo2 {
    /*
    項目升級到2.0，需要新增一個成員變量
     */

    public static void main(String[] args) {
        A a1 = new A(10,20);
        A a2 = new A(10,20);
        A a3 = new A(10,20, 30);
    }
}

class A {
    int a;
    int b;
    int c;
    public A(){}

    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public A(int a, int b, int c) {
        this(a, b);
        this.c = c;
    }

}
