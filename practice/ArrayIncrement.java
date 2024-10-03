package practice;

import java.util.Arrays;

public class ArrayIncrement {
    public static void main(String[] args) {
        int[] arr = {1,2,9};
        int lastElement = arr[arr.length-1]+1;
        arr[arr.length-1] = lastElement;

        System.out.println(Arrays.toString(arr));
    }
}