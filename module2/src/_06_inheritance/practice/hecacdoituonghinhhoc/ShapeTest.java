package _06_inheritance.practice.hecacdoituonghinhhoc;

public class ShapeTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square = new Square(2.3);
        System.out.println(square);
        square = new Square(5.8,"yellow",true);
        System.out.println(square);
//        Rectangle rectangle = new Rectangle();
//
//        System.out.println(rectangle);
//        rectangle = new Rectangle(2.3,5.8);
//        System.out.println(rectangle);
//        rectangle = new Rectangle(2.5,3.8,"orange",true);
//        System.out.println(rectangle);

    }
}
