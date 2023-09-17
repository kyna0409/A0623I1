package _04_oop.exercise;

import java.util.Scanner;

public class E1_QuadracticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a");
        double a = sc.nextDouble();
        System.out.println("nhap so b");
        double b = sc.nextDouble();
        System.out.println("nhap so c");
        double c = sc.nextDouble();
        QuadraticEquation qua = new QuadraticEquation(a,b,c);
        qua.getter();
        double delta = qua.getDiscriminant();
        System.out.println("delta ="+delta);
        if(delta<0)
        {
            System.out.println("The equation has no roots");
        }else if(delta==0)
        {
            System.out.println("phuong trinh co 1 nghiem kep "+qua.getRoot1());
        }else {
            System.out.println("phuong trinh co hai nghiem");
            System.out.println("nghiem x1 = "+qua.getRoot1());
            System.out.println("nghiem x2 = "+qua.getRoot2());
        }
    }
}
class QuadraticEquation{
    private double a, b, c;
    public QuadraticEquation(double a, double b, double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void getter()
    {
        System.out.println("he so a ="+this.a+" he so b ="+this.b+"he so c ="+this.c);
    }
    public double getDiscriminant()
    {
        double delta = Math.pow(this.b,2)-4*this.a*this.c;
        return delta;
    }
    public double getRoot1()
    {
        double r1 = (-this.b+Math.pow(this.getDiscriminant(),0.5))/(2*a);
        return r1;
    }
    public double getRoot2()
    {
        double r2 = (-this.b-Math.pow(this.getDiscriminant(),0.5))/(2*a);
        return r2;
    }
}
