package _07_abstract_interface.practice.b3_compartor;

import _06_inheritance.practice.hecacdoituonghinhhoc.Circle;
import _07_abstract_interface.practice.b2_comparable.ComparableCircle;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Circle[]circles = new Circle[3];
        circles[0]= new Circle(3.6);
        circles[1]=new Circle();
        circles[2]=new Circle(3.5,"red",false);
        System.out.println("Pre-sorted");
        for (Circle cicle:circles) {
            System.out.println(cicle);
        }
        CircleComparator circleComparator =new CircleComparator();
        Arrays.sort(circles,circleComparator);
        System.out.println("After_sorted");

        for (Circle cicle:circles) {
            System.out.println(cicle);
        }
    }
}
