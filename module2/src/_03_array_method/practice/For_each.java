package _03_array_method.practice;

import java.util.Scanner;

public class For_each {
    public static void main(String[] args) {
        System.out.println(" duyet tat ca cac phan tu trong mang");
        // khai bao mang va khoi tao mang
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in); // khoi tao mot dot tuong Scanner
        for(int i = 0; i < a.length; i++)
        {
            a[i]= sc.nextInt();
        }
        for(int i = 0; i < a.length; i++)
        {
            System.out.println("a["+i+"]="+a[i]+" ");
        }
//        for (int index : a){
//            System.out.println("a["+index+"]="+a[index]+" ");
//        }

    }
}
