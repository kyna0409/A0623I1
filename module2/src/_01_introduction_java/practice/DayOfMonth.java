package _01_introduction_java.practice;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which month that you want to count days? ");
        int month = sc.nextInt();
        switch (month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The month "+month+" has 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("The month "+month+" has 30 days");
                break;
            case 2:
                System.out.println("The month "+month+" has 28 days or 29 days");
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
    }
}
