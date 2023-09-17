package _03_array_method.practice.multidimensional_array;

import java.util.Scanner;

public class InOutArray {
    public static void main(String[] args) {
        int [][] a = new int [10][10];// khai bao mang hai chieu
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + a.length + " rows and " + a[0].length + " columns: ");
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length;j++)
            {
               // a[i][j]=sc.nextInt();
                a[i][j]= (int)(Math.random()*100+1);// nhập giá trị ngẫu nhiên từ 1 đến 100
            }
        }
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length;j++)
            {
                System.out.println("a["+i+"]["+j+"]="+a[i][j]);
            }
        }

    }
}
