package _03_array_method.exercise;

import java.util.Scanner;

public class SumMainDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap size");
        int size = sc.nextInt();
        int[][] a = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("ma tran a :");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("tong duong cheo chinh "+sumMainDiagonal(a));
    }
    static int sumMainDiagonal(int [][]a)
    {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(i==j)
                {
                    sum+=a[i][j];
                }
            }
        }
        return sum;
    }
}
