package oop;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        Phone p2 = new Phone();
        p1.brand = "小米";
        p1.color = "white";
        p1.price = 4999;
        p2.brand = "華爲";
        p2.color = "black";
        p2.price = 6999;

        System.out.println(p1.brand);
        System.out.println(p1.color);
        System.out.println(p1.price);
        System.out.println(p2.brand);
        System.out.println(p2.color);
        System.out.println(p2.price);

        p1.call("jay");
        p2.sendMessage();
    }
}
