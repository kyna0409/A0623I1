package _06_inheritance.exercise.e1_circle_cylinder;

public class Cylinder extends Circle{
    private double height ;
    public Cylinder()
    {
        this.height = 2;
    }
    public Cylinder(double height)
    {
        this.height=height;
    }
    public Cylinder(double radius, double height, String color)
    {
        super(radius, color);
        this.height=height;
    }
    public  double getVolume(int radius, int height){
        double baseArea = getArea();
        double perimeter = getPerimeter();
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }

    public double getHeight() {
        return height;
    }
    public void setRadius(double radius)
    {
        super.setRadius(radius);
    }
    public double getVolume()
    {
        return 2*Math.PI*getRadius()*(getRadius()*height);
    }
    public String toString()
    {
        return super.toString()
                +"\nthe tich hinh tru la:"
                +getVolume();
    }
}
