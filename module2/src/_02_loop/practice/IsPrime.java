package _02_loop.practice;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        if(n<2)
        {
            System.out.println(n+" is not a prime");
        }else{
            int i=2;
            boolean check = true;
            while (i<=Math.sqrt(n))
            {
                if(n%i==0)
                {
                    check = false;
                    break;
                }
                i++;
            }
           if(check)
           {
               System.out.println(n+" is a prime");
           }else
           {
               System.out.println(n+" is not a prime");
           }
        }
    }
}
