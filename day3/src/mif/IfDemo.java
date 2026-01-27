package mif;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        System.out.println("start");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("go");
        }
        System.out.println("end");
    }
}
