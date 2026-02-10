package math;

import java.io.IOException;
import java.util.Scanner;

public class RuntimeTest {
    public static void main(String[] args) throws IOException, InterruptedException {

        //1.public static Runtime getRuntime() 返回與當前java應用程序關聯的運行時對象
        Runtime runtime = Runtime.getRuntime();

        //2.public void exit(int status)終止當前運行的虛擬機，該參數用做狀態代碼；按照管理，非零狀態代碼表示異常終止

        //runtime.exit(0);

        //3.public int availableProcessors():獲取虛擬機能夠使用的處理器數
        System.out.println("處理器數" + runtime.availableProcessors());
        //4.public long totalMemory()返回java虛擬機中的内存總量。字節數
        System.out.println("java虛擬機中的内存總量" + Runtime.getRuntime().totalMemory()/1024.0/1024.0 + "mb");

        //5.public long freeMemory(）返回Java虛擬機中的可用内存
        System.out.println("java虛擬機中的可用内存量" + Runtime.getRuntime().freeMemory()/1024.0/1024.0 + "mb");

        //6.public Process exec(String command):執行命令，啓動程序
        Process process = runtime.exec("calc");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.next();
        switch (command) {
            case "y":
                process.destroy();
            default:
                System.out.println(command);
        }
        System.out.println("exit");


    }
}

