package _01_introduction_java.practice;

import java.util.Scanner;

public class P4_LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a*x+b=c , please enter constants:");
        Scanner sc = new Scanner(System.in);

        System.out.println("a: ");
        double a = sc.nextDouble();

        System.out.println("b: ");
        double b = sc.nextDouble();

        System.out.println("c: ");
        double c = sc.nextDouble();

        if(a!=0)
        {
            double answer = (c-b)/a;
//            System.out.println("Equation pass with x=%f!\n",answer);
            System.out.println("Equation pass with x="+answer);
        }else {
            if(b ==c)
            {
                System.out.println("The solution is all x!");
            }else{
                System.out.println("No solution!");
            }
        }
    }
}
