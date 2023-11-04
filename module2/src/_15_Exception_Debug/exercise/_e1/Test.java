package _15_Exception_Debug.exercise._e1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        try {
            Triangle triangle = new Triangle(a, b, c);
            System.out.println(triangle.sumofside());
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
        System.out.println("finished");


    }
}
