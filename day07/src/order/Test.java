package order;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input : 1.國内 ， 2.overseas");

        int choice = sc.nextInt();

        OrderService orderService = null;
        //Animal a;

        switch (choice) {
            case 1:
                //國内
                orderService  = new OrderServicelmpl();
                //a = new Dog();
                break;
            case 2:
                //overseas
                orderService = new OverseasServicelmpl();
                OverseasServicelmpl o = (OverseasServicelmpl) orderService;
                o.check();
                //a = new Cat();
                break;
            default:
                orderService  = new OrderServicelmpl();

        }

        orderService.create();
        orderService.findOne();
        orderService.findList();
        orderService.cancel();
        orderService.finish();
        orderService.paid();
    }
}
