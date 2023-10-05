package _01_introduction_java.practice;

import java.util.Arrays;

public class Test {
    public static int[] swap(int[] arr) {
        // code
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[arr.length-1];
        }
        return arr;
    }
    public static void main(String[] args) {
         int [] arr = new int[]{1, 5, 10, -2};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(swap(arr));
        }
    }
}
