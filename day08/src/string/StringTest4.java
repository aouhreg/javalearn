package string;

import java.util.Scanner;

public class StringTest4 {
    public static void main(String[] args) {
        //目標：完成用戶登錄功能
        //登入功能是一個獨立的功能（獨立功能獨立成方法）。
        //3次登錄

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter a string");
            String s = sc.nextLine();
            System.out.println("password");
            String p = sc.nextLine();

            String result = login(s,p);
            if("success".equals(result)) {
                System.out.println("You are logged in");
                break;
            }
            else {
                System.out.println(result);
            }
        }
        
    }
    public static String login(String username, String password) {
        //1.拿到正確的登入名和密碼
        String okLoginName ="jl";
        String okPassword = "jl";
        //2.判斷是否相同
        if(username.equals(okLoginName) && password.equals(okPassword)) {
            return "success";
        }
        else
            return "fail";

    }
}
