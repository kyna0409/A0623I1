package _06_inheritance.exercise.e1_circle_cylinder;

public class test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println( circle.toString());
        Cylinder cylinder=new Cylinder();
        cylinder.setRadius(10);
        System.out.println( cylinder.toString());
    }
}
