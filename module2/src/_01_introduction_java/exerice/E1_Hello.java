package _01_introduction_java.exerice;

import java.util.Scanner;

public class E1_Hello {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Hello: "+name);
    }
}
