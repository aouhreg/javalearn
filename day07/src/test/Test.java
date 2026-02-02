package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("intpu 1.platform 2 bankcard 3.creditcard");

        int choice = sc.nextInt();

        Payment p = null;

        switch (choice) {
            case 1:
                p = new PlatformPaymentlmpl();
                break;
            case 2:
               p = new BankcardPaymentlmpl();
                break;
            case 3:
                p = new CreditCardPaymentlmpl();
                break;

        }
        System.out.println("input money");
        Scanner smoney = new Scanner(System.in);
        double money = smoney.nextDouble();
        p.pay(money);
    }
}
