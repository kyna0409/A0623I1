package _06_inheritance.exercise.e4_design_class;

public class Shape {
    private double side1;
    private String color;
    public Shape()
    {
        this.side1 = 1.0;
        this.color = "red";
    }

    public  Shape(double side1, String color)
    {
        this.side1=side1;
        this.color=color;
    }

    public double getSide() {
        return side1;
    }

    public void setSide(double side) {
        this.side1 = side1;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "side=" + side1
                +"color="+color;
    }
}
