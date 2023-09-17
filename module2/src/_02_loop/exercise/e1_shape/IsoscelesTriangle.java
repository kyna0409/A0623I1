package _02_loop.exercise.e1_shape;

import java.util.Scanner;

public class IsoscelesTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int height;
        int width;

        System.out.print("height = ");
        height = sc.nextInt();
        System.out.print("width = ");
        width = sc.nextInt();

        for(int i = 1; i <= height; i++){
            for(int j = 1; j <= width; j++) {
                if(j<width-i+1)
                {
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            }
            for(int j = 1; j < i; j++) {
                    System.out.print("* ");
            }
            System.out.println(" ");
        }


        sc.close();
    }
}
