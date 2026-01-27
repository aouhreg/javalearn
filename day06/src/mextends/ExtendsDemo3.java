package mextends;

public class ExtendsDemo3 {
    /*
    方法重寫的使用場景：
    子類繼承了父類的方法，但是子類不想原封不動地繼承父類的方法邏輯，想要修改或者是增强，就可以重寫父類方法。

    方法重載(Overload):在同一個類中，方法名相同，參數不同，與返回值無關
    參數不同：個數不同類型不同，順序不同。

    方法重寫（overwrite):在子父類中，出現了方法聲明完全一致的方法（方法名，參數，返回值都需要和父類保持一致）
     */
    public static void main(String[] args) {
        son s = new son();
        s.love();
    }
}

class father{
    public void love(){
        System.out.println("flower");
    }
}

class son extends father{
    @Override  // Override校驗當前方法，是否是重寫的方法
    public void love() {
        super.love();
        System.out.println("money");
    }
}