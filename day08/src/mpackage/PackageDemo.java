package mpackage;

import java.util.*;

public class PackageDemo {
    /*
    包：本質來説是文件夾，用力啊管理類文件的

    Scanner類名
    java.util.Scanner全類名

    一個類中，需要使用不同的類，但是這兩個類名稱是相同的
    默認只能導入一個，另外一個要帶包訪問
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String s = sc.nextLine();
        System.out.println();
    }
}
