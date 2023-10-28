package _13_search_algorithm.exercise.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            int n=scanner.nextInt();
            array[i]=n;
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println(binarySearch(array,0,array.length-1,1));
    }
    public static int  binarySearch(int[] array, int left, int right ,int value)
    {
         while (right>=left)
         {
             int middle = (left+right)/2;
             if(array[middle]==value){
                 return middle;
             }else if (value>array[middle])
             {
                 return binarySearch(array,middle+1,right,value);
             } else {
                 return binarySearch(array,left,middle-1,value);
             }
         }
         return -1;
    }

}
