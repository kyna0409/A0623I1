package _03_array_method.exercise;

import java.util.Scanner;

public class E3_CombineTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap do dai mang");
        int size = sc.nextInt();
        int [] a = new int[size];
        int [] b = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("mang a :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        for (int i = 0; i < b.length; i++) {
            b[i]=sc.nextInt();
        }
        System.out.println("mang b :");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
        System.out.println(" ");
        System.out.println("mang sau khi gop hai mang a va b");
        combineTwoArray(a,b,size);
    }
    static void combineTwoArray(int []a,int []b,int size)
    {
        int [] c = new int[2*size];

        for (int i=0;i<a.length;i++)
        {
            c[i] = a[i];
        }
        for(int i=0;i<b.length;i++)
        {
            c[i+b.length]=b[i];
        }
        for (int value: c) {
            System.out.print(value+" ");
        }
    }
}
