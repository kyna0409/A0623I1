package _03_array_method.practice.multidimensional_array;

import java.util.Scanner;

public class SumOfCol {
    public static void main(String[] args) {

        int [][] a = new int [10][10];// khai bao mang hai chieu
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + a.length + " rows and " + a[0].length + " columns: ");
        for(int i=0; i<a.length; i++)
        {
            int sum =0;
            for(int j=0; j<a[i].length;j++)
            {
                // a[i][j]=sc.nextInt();
                a[i][j]= (int)(Math.random()*100+1);// nhập giá trị ngẫu nhiên từ 1 đến 100
            }
        }
        for (int column = 0; column < a[0].length; column++) {
            int total = 0;
            for (int row = 0; row < a.length; row++)
                total += a[row][column];
            System.out.println("Sum for column " + column + " is "
                    + total);
        }

    }
}
