package mswitch;

public class SwitchTest {
    public static void main(String[] args) {
        season(4);
    }
    public static void season(int month){
        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6,7,8:
                System.out.println("summer");
                break;
        }
    }
}
