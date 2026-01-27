package demo;

public class MethodTest2 {
    public static void main(String[] args) {
//目標：完成求一個整數是技術還是偶數
    check(5);
    }
    public static void check(int number){
        if(number % 2 == 0 ){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }

}
