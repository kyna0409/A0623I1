package _03_array_method.exercise;

import java.util.Scanner;

public class SumOneColumnDefine {
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
        System.out.println(a[0].length);
        System.out.println("nhap chi so cot ma ban muon thay tong cac so o cot do ");
        int index_col = sc.nextInt();
        System.out.println("tong cac so cua cot "+index_col+" la :"+sumColumn(a,index_col));
    }
    static int sumColumn(int [][]a, int index_col)
    {
        int [] sum_array = new int[a[0].length];
        for (int column = 0; column < a[0].length; column++) {
            int sum = 0;
            for (int row = 0; row < a.length; row++) {
                sum+= a[row][column];
            }
                sum_array[column]=sum;

        }
        return sum_array[index_col];
    }
}
