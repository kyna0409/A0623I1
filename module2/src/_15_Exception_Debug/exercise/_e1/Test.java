package _15_Exception_Debug.exercise._e1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        try {
            triangle(a,b,c);

        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
        System.out.println("finished");


    }
    public static void triangle(int a,int b,int c)throws IllegalTriangleException
    {
        if(a<=0||b<=0||c<=0||a+b<=c||b+c<=a||a+c<=b)
        {
            throw new IllegalTriangleException("three a,b,c cannot is side of a triangle");
        }
    }
}
