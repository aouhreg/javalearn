package loop;

public class MarkDemo {
    public static void main(String[] args) {
        lo:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(j == 2){
                    break lo;
                }
                System.out.println("h");
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(j == 2){
                    break ;
                }
                System.out.println("h");
            }
        }
    }
}
