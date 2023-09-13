package _01_introduction_java.practice;

import java.util.Scanner;

public class OperatorExpression {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc = new Scanner(System.in);// khai bao doi tuong scanner
        System.out.println("Enter width:");
        width = sc.nextFloat(); // nhap chieu rong

        System.out.println("Enter height: ");
        height = sc.nextFloat(); // nhap chieu dai

        float area = width*height;
        System.out.println("Area is: "+area);

    }

}
