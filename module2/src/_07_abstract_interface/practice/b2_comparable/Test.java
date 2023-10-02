package _07_abstract_interface.practice.b2_comparable;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0]= new ComparableCircle(3.6);
        circles[1]= new ComparableCircle();
        circles[2]= new ComparableCircle(3.5,"red",false);

        System.out.println("Pre-sorted");
        for (ComparableCircle cicle:circles) {
            System.out.println(cicle);
        }
        Arrays.sort(circles);
        System.out.println("After_sorted");

        for (ComparableCircle cicle:circles) {
            System.out.println(cicle);
        }
    }
}
