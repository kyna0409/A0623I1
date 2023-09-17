package _01_introduction_java.exercise;

import java.util.Scanner;
// chuoi muon true thi phai cung ô nhớ vì string la bien doi tuong
public class E3_CovertMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float money;
        String dv ;
        System.out.println("nhap don vi can chuyen VND/USD : ");
        dv = sc.nextLine();
        System.out.println("nhap so tien can doi : ");
        money = sc.nextFloat();
        System.out.println(dv.equals("U"));

        if(dv.toLowerCase().equals("usd"))
        {
            System.out.println(money+" USD = "+money*23000+" VND ");
        }else {
            System.out.println(money+" VND = "+money/23000+" USD ");
        }
    }
}
