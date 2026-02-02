package order;

public class OverseasServicelmpl implements OrderService{
    public void check(){
        System.out.println("check ip");
    }

    @Override
    public void create() {
        System.out.println("create overseas");
    }

    @Override
    public void findOne() {
        System.out.println("findOne overseas");
    }

    @Override
    public void findList() {
        System.out.println("findList overseas");
    }

    @Override
    public void cancel() {
        System.out.println("cancel overseas");
    }

    @Override
    public void finish() {
        System.out.println("finish overseas");
    }

    @Override
    public void paid() {
        System.out.println("paid overseas");
    }
}
