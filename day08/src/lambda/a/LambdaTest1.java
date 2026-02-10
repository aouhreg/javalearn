package lambda.a;

public class LambdaTest1 {
    public static void main(String[] args) {
        useShowHandler(new ShowHandler() {
            @Override
            public void show() {
                System.out.println("匿名内部類重寫后的show方法");
            }
        });

        useShowHandler(() -> System.out.println("lambda show"));
    }

    public static void useShowHandler(ShowHandler showHandler) {
        showHandler.show();
    }
}

@FunctionalInterface
interface ShowHandler {
    void show();
}
