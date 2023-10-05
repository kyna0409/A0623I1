package _06_inheritance.exercise.e1_circle_cylinder;

public class Circle {
    private double radius ;
    private String color ="red";
    public Circle()
    {
        this.radius = 1.0;
    }
    public Circle(double radius, String color)
    {
        this.radius=radius;
        this.color=color;
    }
    public double getPerimeter()
    {
        return Math.PI*radius*2;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
    public  String getColor()
    {
        return color;
    }
    public  void setColor(String color)
    {
        this.color=color;
    }
    public String toString()
    {
        return "ban kinh la  : "
                +getRadius()
                +"\nmau sac la: "
                +getColor()
                +"\ndien tich hinh tron la:"
                +getArea();
    }
}
