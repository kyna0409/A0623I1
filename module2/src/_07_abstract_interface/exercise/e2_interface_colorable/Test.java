package _07_abstract_interface.exercise.e2_interface_colorable;


public class Test {
    public static void main(String[] args) {
       Shape[] shape =new Shape[3];
        shape[0] = new Circle(2,"red",true);
        shape[1] = new Rectangle(5,6,"green",false);
        shape[2] = new Square(7,"blue",true);

        for (Shape shapes:shape) {
            if(!(shapes instanceof Square))
            {
                System.out.println(shapes);
            }
           if(shapes instanceof Square)
           {
               System.out.println(shapes);
               Colorable colorable = (Square)shapes;
               colorable.howToColor();
           }
        }

    }
}
