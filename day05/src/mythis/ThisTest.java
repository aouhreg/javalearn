package mythis;

public class ThisTest {
    /*
    this的作用：調用本類的成員變量

    this.本類成員變量；
    this.本類成員方法；

    省略規則：
    this.本類成員變量：如果不涉及重名問題，this.可以省略不寫
    this.本類成員方法：this.可以直接省略不寫

    this介紹：代表當前類對象的引用（地址）
    哪一個對象調用的方法，方法中的this就代表哪一個對象

    p1.print() ---> this --> p1's address
    p2.print() ---> this --> p2's address
     */
    public static void main(String[] args) {
        Person p = new Person();
        p.show();
        p.method();
        System.out.println(p);
        p.print();

        Person p2 = new Person();
        System.out.println(p2);
        p2.print();
    }
}
