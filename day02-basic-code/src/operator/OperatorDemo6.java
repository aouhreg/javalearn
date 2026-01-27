package operator;

public class OperatorDemo6 {
    public static void main(String[] args) {
        //目標：邏輯運算符
        //1. &
        double height = 169;
        char sex = 'g';
        System.out.println(height>160 & sex == 'g');
        //2.|
        //3.！
        //4.^ ：前後條件一直是false，必須前後條件不一樣結果才是true
        // && 左邊false，右邊不執行
        // || 左邊true，右邊不執行
    }
}
