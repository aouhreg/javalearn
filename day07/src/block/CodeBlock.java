package block;

public class CodeBlock {
    /*
    1.局部代碼塊
        位置：跟局部有關的都是方法有關，方法中的一對{}
        作用：限定變量的生命周期，提早釋放内存
    2.構造代碼塊
        位置：類中方法外的一對{}
        特點：創建對象的時候被調用執行，無論使用哪一個構造方法創建對象，都要執行構造代碼塊
            優先於構造方法執行
        作用：如果發現所有構造方法中，存在相同的代碼，就可以考慮將這段相同的代碼抽取到構造代碼塊中。
        用的比較少
    3.靜態代碼塊
        位置：類中方法外的一對{} 需要加入static關鍵字
        特點：隨著類的加載而執行
            -字節碼加載的時候，靜態代碼塊就會執行，因爲字節碼只加載一次，靜態代碼塊也執行一次
        作用：用於執行一些初始化操作。
    4.同步代碼塊：多綫程的章節講
     */
    public static void main(String[] args) {
        {
            int num = 10;
            System.out.println(num);
        }

        Student stu1 = new Student();
        Student stu2 = new Student(10);
    }


}


class Student{
    static{
        System.out.println("Student 的靜態代碼塊執行");
    }
    {
        System.out.println("123");
    }
    public Student() {
        System.out.println("Student 類的空參構造代碼塊");
    }
    public Student(int num) {
        System.out.println("Student 類的帶參構造代碼塊");
    }
}