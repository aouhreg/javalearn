package test;

public class BankcardPaymentlmpl implements Payment{
    @Override
    public void pay(double money) {
        System.out.println("from bankcard payment " + money);
    }
}
