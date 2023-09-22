package _06_inheritance.exercise.e4_design_class;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        do{
            a= sc.nextDouble();
            b= sc.nextDouble();
            c= sc.nextDouble();
            triangle.setSide1(a);
            triangle.setSide2(b);
            triangle.setSide3(c);
            System.out.println(triangle.check(a,b,c));
            if(triangle.check(a, b, c))
            {

                System.out.println(triangle);
                break;
            }else {
                System.out.println("ban hay nhap ba canh lai");
            }

        }while(!triangle.check(a, b, c));

    }
}
