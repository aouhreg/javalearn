package test;

import tools.ArrayTools;

public class ArrayToolsTest {
    public static void main(String[] args) {

        int[] arr = {11,22,33,44,55};
        int max = ArrayTools.getMax(arr);
        int min = ArrayTools.getMin(arr);
        ArrayTools.show(arr);
        System.out.println(max);
        System.out.println(min);
    }
}
