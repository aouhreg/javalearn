package mswitch;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println('1');
                break;
            case 2:
                System.out.println('2');
                break;
            default:
                System.out.println("none");
        }
    }
}
