package operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        //目標，完成拆分數字
        int total = 132;
        int bai = total / 100 % 10;
        int shi = total / 10 % 10;
        int ge = total % 10;
        System.out.println("<UNK>" + bai);
        System.out.println("<UNK>" + shi);
        System.out.println("<UNK>" + ge);
    }
}
