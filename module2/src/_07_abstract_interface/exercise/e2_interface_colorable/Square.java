package _07_abstract_interface.exercise.e2_interface_colorable;
public class Square extends Rectangle implements Colorable{
    public Square()
    {

    }
    public Square(double side)
    {
        super(side,side);
    }
    public Square(double side, String color, boolean filled)
    {
        super(side,side,color,filled);
    }
    public double getSide()
    {
        return getWidth();
    }
    public void setSide(double side)
    {
        setWidth(side);
        setLength(side);
    }
    public void setWidth(double width)
    {
        setSide(width);
    }
    public void setLength(double length)
    {
        setLength(length);
    }
    public String toString()
    {
        return "A Square with side = "
                + getSide()
                +", which is a subclass of"
                +super.toString()
                +", dien tich hinh vuong "
                +getArea();
    }


    @Override
    public void howToColor() {
        System.out.println("Color all four sides such as:");
        System.out.println("side a number one is red ");
        System.out.println("side a number two is green ");
        System.out.println("side a number three is blue ");
        System.out.println("side a number four is pink ");
    }
}
