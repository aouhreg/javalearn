package mextends;

import org.w3c.dom.ls.LSOutput;

public class ExtendsDemo2 {
    public static void main(String[] args) {
        zi z = new zi();
        z.show();
    }
}


class Fu{
    int num = 10;
}
class zi extends Fu{
    int num = 20;

    public void show(){
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}