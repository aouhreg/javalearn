package atm;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//ATM操作系統，賬戶操作對象，負責賬戶數據的業務處理
public class ATM {
    //1.定義一個集合容器存儲全部的賬戶對象
    private ArrayList<Account> accounts = new ArrayList<>();
    //2.準備一個掃描器，後面都要用

    private Scanner sc = new Scanner(System.in);
    //3.展示一個歡迎界面
    public void start(){
        while (true) {
            System.out.println("======welcome atm======");
            System.out.println("1.用戶登入");
            System.out.println("2.用戶開戶");
            System.out.println("input");
            String command = sc.next();
            switch(command){
                case "1":
                    //登入
                    break;
                case "2":
                    //開戶
                    break;
                default:
                    System.out.println("input error");
            }
        }

    }
    /**
     * 用戶開戶
     */
    private void registerAccount(){
        System.out.println("===用戶開戶====");
        //1.創建賬戶對象
        Account account = new Account();

        //2.輸入數據注入賬戶對象
        System.out.println("輸入賬戶名稱");
        String userName = sc.next();
        System.out.println(userName);
        String sex = null;
        while (true) {
            sex = sc.next();
            if("m".equals(sex) || "w".equals(sex)){
                account.setSex(sex.charAt(0));
                break;
            }
            else{
                System.out.println("input error");
            }
        }

        while (true) {
            System.out.println("password");
            String passWord = sc.next();
            System.out.println("password again");
            String passWordAgain = sc.next();
            if(passWord.equals(passWordAgain)){
                account.setPassWord(passWordAgain);
                break;
            }
            else{
                System.out.println("intput error");
            }
        }

        while (true) {
            System.out.println("limit money");
            double limitMoney = sc.nextDouble();
            if(limitMoney >= 1000){
                account.setLimit(limitMoney);
            }
            else{
                System.out.println("input error");
            }
        }

        //為賬戶生產一個8為數字卡號，并且與其他賬戶卡號不重複(獨立功能)

//        while (true) {
//            String cardId = "";
//            Random random = new Random();
//            for (int i = 0; i < 8; i++) {
//                cardId += random.nextInt(10);
//            }
//
//            //判斷卡號是否重複
//
//            Account otherAcc = getAccountByCardId(cardId);
//            if(otherAcc == null){
//                account.setCardId(cardId);
//                break;
//            }
//        }


//        System.out.println(sex);


        //3.把賬戶對象加入到集合容器中
        //allaccounts.add(acc);
//        System.out.println("恭喜您，開戶成功您的卡號是:"+ account.getCardId() );
 }

    public Account getAccountByCardId(String cardId){
        for (Account account : accounts) {
            if(account.getCardId().equals(cardId)){
                return account;
            }
        }
        return null;
    }

}
