package test;

public class sum1100 {
    public static void main(String[] args) {

        System.out.println(sum());
        System.out.println(judgesum());
    }
    public static int sum(){
        int sum = 0;
        for( int  i = 0; i<=100; i+=2){
            sum += i;
        }
        return sum;
    }
    public static int judgesum(){
        int sum = 0;
        for(int i =1;i<=100;i++){
            if(i%2 ==0){
                sum+=i;
            }
        }
        return sum;
    }
}
