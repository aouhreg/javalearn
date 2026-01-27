package test;

public class ForTest {
    public static void main(String[] args) {
        System.out.println(printNarcissusNumber());
    }
    public static void timer(){
        for(int i = 1;i<=3;++i){
            System.out.println(i);
        }

        for (int i = 3; i>=1;--i)
        {
            System.out.println(i);
        }
    }
    public static int printNarcissusNumber(){
        int count = 0;
        for(int i =100; i<=999;++i){
            int ge_i = i % 10;
            int shi_i = i / 10 % 10;
            int bai_i = i /100;
            if(ge_i *ge_i *ge_i +shi_i*shi_i*shi_i +bai_i*bai_i*bai_i == i)
            {
                System.out.println(i);
                count += 1;
            }
        }
        return count;

    }
}
