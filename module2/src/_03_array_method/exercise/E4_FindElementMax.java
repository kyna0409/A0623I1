package _03_array_method.exercise;

import java.util.Scanner;

public class E4_FindElementMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap row");
        int row = sc.nextInt();
        System.out.println("nhap column");
        int column = sc.nextInt();
        int[][] a = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("ma tran a :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("phan tu lon nhat trong matrix:");
        System.out.println(findElementMax(a, row, column));
    }

    static int findElementMax(int[][] a, int row, int column) {
        int max = a[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (a[i][j] >= max) {
                    max = a[i][j];
                }
            }
        }
        return max;
    }
}
