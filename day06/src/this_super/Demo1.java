package this_super;

public class Demo1 {
    /*
    super的調用細節：
    super.父類成員變量
    super.父類成員方法();

    如果調用的成員，在子類不存在，super可以省略不寫
     */
    public static void main(String[] args) {
        zi z = new zi();
        z.method();
    }

}

class Fu{
    int num = 10;
    public void show(){
        System.out.println("fu show");
    }
}

class zi extends Fu{
    public void method(){
        System.out.println(num);
        show();
    }
}