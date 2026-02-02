package test;

public class CreditCardPaymentlmpl implements Payment{
    @Override
    public void pay(double money) {
        System.out.println("from credit card payment" + money);
    }
}
