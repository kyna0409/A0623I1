package _03_array_method.exercise;

import java.util.Scanner;

public class E1_DeleteElementInArray {
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
        System.out.println("nhap phan tu can xoa trong mang");
        int x = sc.nextInt();
        System.out.println("mang ban sau khi xoa");
        deleteElement(a, x);

    }

    static int findIndex(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) return i;
        }
        return -1;
    }

    static void deleteElement(int[] a, int x) {
        if (findIndex(a, x) == -1) {
            System.out.println("khong co phan tu nay trong mang");
        } else {
            for (int i = findIndex(a, x); i < a.length; i++) {
                if (i == a.length - 1) {
                    a[i] = 0;
                }else
                {
                    a[i] = a[i + 1];
                }
            }
            for (int value : a) {
                System.out.println(value + " ");

            }
        }
    }
}
