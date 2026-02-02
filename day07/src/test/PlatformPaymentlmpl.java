package test;

public class PlatformPaymentlmpl implements Payment{


    @Override
    public void pay(double money) {
        System.out.println("from platform payment " + money);
    }
}
