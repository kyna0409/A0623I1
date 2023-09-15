package _02_loop.exerice;

import java.util.Scanner;

public class E2_Prime20 {
    static boolean check(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("nhap so luong so nguyen to can in ra ");
        int n = sc.nextInt();
        int prime = 2;
        while (count <= n) {
            if (check(prime)) {
                System.out.println(prime);
                count++;
            }
            prime++;
        }
    }
}
