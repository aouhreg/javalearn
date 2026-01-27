package template;

public abstract class TextTemplate {
    public final void write(){
        System.out.println("begin");

        body();

        System.out.println("end");
    }
    public abstract void body();
}
