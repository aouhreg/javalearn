package loop;

public class DoWhileDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println("hello");
        }

        int i = 1;
        do{
            System.out.println("hello");
            i++;
        }while(i<5);
    }
}
