package _06_inheritance.exercise.e3_point_moveablePoint;

public class Test {

    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(10,10,10,10);
        MoveablePoint o = moveablePoint.move();
        System.out.println(o);
    }
}
