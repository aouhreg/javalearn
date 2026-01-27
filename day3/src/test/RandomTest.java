package test;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        guessNumber();
    }

    public static void guessNumber() {
        //1.random number
        //2.input
        //3.judge and tips
        //4. if done break;

        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int num = r.nextInt(100) + 1;
        int i = 0;
        while(true){
            i++;
            int input = sc.nextInt();


            if (input == num) {
                System.out.println("good,you guess" + i + "count");
                break;
            } else if (input > num) {
                System.out.println("small");

            } else {
                System.out.println("bigger");

            }

        }

    }
}
