package array;

import java.util.Arrays;

public class Demo0 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 0};
        int[] arr2 = new int[5];
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.equals(arr, arr2));
    }
}