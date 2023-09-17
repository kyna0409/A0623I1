package _03_array_method.exercise;

import java.util.Scanner;

public class E2_InsertElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap do dai mang");
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("mang ban dau");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("nhap phan tu can chen trong mang");
        int x = sc.nextInt();
        System.out.println("nhap vi tri can chen");
        int index = sc.nextInt();
        System.out.println("mang ban sau khi chen");
        insertElement(a,index,x);
    }
    static void insertElement(int []a, int index, int x)
    {
        if(index<=1 || index>=a.length-1)
        {
            System.out.println("khong chen duoc phan tu vao mang");
        }else {
            int []aNew=new int[a.length+1];
            aNew[index]=x;
            for(int i=0;i<index;i++)
            {
              aNew[i]=a[i];
            }
            for(int i=index+1;i<aNew.length;i++)
            {
                aNew[i]=a[i-1];
            }

            for (int value : aNew) {
                System.out.println(value + " ");

            }
        }
    }
}
