package _01_introduction_java.practice;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter a year:");
        year = sc.nextInt();
        if((year % 400 == 0)||(year % 4 ==0 && year % 100 != 0))
        {
            System.out.printf("%d is  a leap year", year);
        }else
        {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}
