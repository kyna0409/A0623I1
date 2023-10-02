package _07_abstract_interface.exercise.e1_interface_resizeable;

public class Test {
    public static void main(String[] args) {
        Shape [] shape =new Shape[3];
        shape[0] = new Circle(2,"red",true);
        shape[1] = new Rectangle(5,6,"green",false);
        shape[2] = new Square(7,"blue",true);
        System.out.println("truoc khi thay doi kich thuoc");
        for (Shape shapes:shape) {
            System.out.println(shapes);
        }
        System.out.println("sau khi thay doi kich thuoc");
        for (Shape shapes:shape) {
            shapes.resize(100);
            System.out.println(shapes);
        }

    }
}
