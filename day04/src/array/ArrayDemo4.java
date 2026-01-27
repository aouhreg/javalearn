package array;

public class ArrayDemo4 {
    /*
    動態初始化：初始化時只指定數組長度，由系統為數組分配初始值
    格式：數據類型【】 數組名 = new 數據格式【數組長度】

    分類
        整數：0
        小數：0.0
        bool：false
        字符：'\u0000' 常見體現是空白字符
        引用數據類型字符串：null

        引用數據類型：數組，類，接口

        字符串--》類--》引用數據類型
     */
    public static void main(String[] args) {
        String[] arr = new String[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr);
        }
    }
}
