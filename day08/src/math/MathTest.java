package math;

import java.util.Random;

public class MathTest {
    public static void main(String[] args) {
        System.out.println(Math.abs(-12));
        System.out.println(Math.abs(-12.5));
        System.out.println(Math.abs(12.5));

        System.out.println(Math.ceil(4.00001));
        System.out.println(Math.floor(4.9999999));

        System.out.println(Math.round(4.9999999));

        System.out.println(Math.max(10,20));
        System.out.println(Math.min(10,20));

        System.out.println(Math.pow(2,3));
        System.out.println(Math.random());

    }
}
