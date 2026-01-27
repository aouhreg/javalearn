package param;

public class MethodParamDemo1 {
    public static void main(String[] args) {
        //目標：掌握進本類型的參數傳遞機制，值傳遞
        int a = 10;
        change(a);
        System.out.println(a); //10
    }
    public static void change(int a){
        System.out.println(a); //10
        a = 20;
        System.out.println(a); //20
    }

}
