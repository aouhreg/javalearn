package order;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input 1.國内 2.overseas");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                OrderServicelmpl orderService = new OrderServicelmpl();
                orderService.create();
                orderService.finish();
                break;
            case 2:
                OverseasServicelmpl overseasService = new OverseasServicelmpl();
                overseasService.create();
                overseasService.finish();
                break;
        }

    }
}
