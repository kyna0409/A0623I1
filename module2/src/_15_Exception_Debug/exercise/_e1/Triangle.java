package _15_Exception_Debug.exercise._e1;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) throws IllegalTriangleException{
        this.a = a;
        this.b = b;
        this.c = c;
        if((a<=0||b<=0||c<=0)&&(a+b<=c||a+c<=b||c+b<=a))
        {
            throw new IllegalTriangleException("side cannot less than 0");
        }
        if (a+c<b||b+c<a||a+b<c)
        {
            throw new IllegalTriangleException("sum of two side cannot less remain side ");
        }
    }
    public int sumofside()
    {
        return a+b+c;
    }

}
