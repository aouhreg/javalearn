package permission;

public class A {

    int num;

    private void method(){
        System.out.println("method");
    }

    public void show(){
        System.out.println(this.num);
        method();
    }
}
