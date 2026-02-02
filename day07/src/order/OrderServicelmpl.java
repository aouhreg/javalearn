package order;

public class OrderServicelmpl implements OrderService{

    @Override
    public void create() {
        System.out.println("create order");
    }

    @Override
    public void findOne() {
        System.out.println("find one order");
    }

    @Override
    public void findList() {
        System.out.println("find list order");
    }

    @Override
    public void cancel() {
        System.out.println("cancel order");
    }

    @Override
    public void finish() {
        System.out.println("finish order");
    }

    @Override
    public void paid() {
        System.out.println("paid order");
    }
}
