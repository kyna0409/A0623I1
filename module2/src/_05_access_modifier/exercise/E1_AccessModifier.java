package _05_access_modifier.exercise;

public class E1_AccessModifier {
    public static void main(String[] args) {
       Circle circle = new Circle();
        System.out.println("ban kinh cua hinh tron la : "+Circle.getRadius()+" \ndien tich cua hinh tron la "+Circle.getArea()+" \nva mau cua hinh tron la "+circle.getColor());
    }
}
class Circle{
    private static double radius = 1.0;
    private String color = "red";
    public Circle(){

    }
    public Circle(double radius)
    {
        this.radius= radius;
    }

    public static double getRadius() {
        return radius;
    }
    public static double getArea()
    {
        return Math.PI*radius*radius;
    }

    public String getColor() {
        return color;
    }
}
