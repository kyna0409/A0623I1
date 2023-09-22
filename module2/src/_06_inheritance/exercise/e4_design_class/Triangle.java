package _06_inheritance.exercise.e4_design_class;

public class Triangle extends Shape{
private double side1,side2,side3;

    public Triangle() {
        this.side1 = 0.1;
        this.side2 = 0.1;
        this.side3 = 0.1;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea()
    {
        double s=  0.25*Math.sqrt((getPerimeter()*(getPerimeter()-side1)*(getPerimeter()-side2)*(getPerimeter()-side3)));
        return s;
    }

    public double getPerimeter()
    {
        double p=(side1+side1+side3)/2;
        return p ;
    }
    public boolean check(double side1,double side2,double side3)
    {
        if((side1>0&&side2>=0&&side3>=0)&&((side1+side2)>side3&&(side1+side3)>side2&&(side3+side2)>side1))
        {
                return true;
        }

        return false;
    }
    @Override
    public String toString() {
        String str;
        if(check(side1,side2,side3))
        {
            str ="do dai ba canh lan luot cua mot tam giac la :"
                    +getSide1()+" "+getSide2()+" "+getSide3()
                    +"\n chu vi cua tam giac la :"+getPerimeter()
                    +"\n dien tich cua tam giac la :"+getArea();
        }else {
            str="ba canh nay khong tao thanh tam giac";
        }
        return str;
    }
}
