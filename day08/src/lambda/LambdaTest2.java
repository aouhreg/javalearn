package lambda;

public class LambdaTest2 {
    public static void main(String[] args) {
        useStringHandler(new StringHandler() {
            @Override
            public void printMessage(String msg) {
                System.out.println("匿名的重寫方法");
            }
        });

        useStringHandler(msg -> System.out.println("lambda 重寫方法"));
    }

    /*
    StringHandler stringHandler = new StringHandler() {
            @Override
            public void printMessage(String msg) {
                System.out.println("匿名的重寫方法");
            }
        }

        stringHandler.printMessage("j")
     */
    public static void useStringHandler(StringHandler stringHandler) {stringHandler.printMessage("j");}
}

@FunctionalInterface
interface StringHandler {
    void printMessage(String msg);
}