package loop;

public class WhileDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
        }

        int i = 1;
        while(i<=5){
            System.out.println("hello");
            i++;
        }

        System.out.println(zhumu());
    }
    public static int zhumu(){
        double peakHeight = 8848860;
        double paperThickness = 0.1;
        int count = 0;
        while(paperThickness <= peakHeight){
            paperThickness *= 2;
            count++;
        }
        return count;
    }

}
