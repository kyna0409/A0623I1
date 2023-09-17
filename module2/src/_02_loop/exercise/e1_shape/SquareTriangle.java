package _02_loop.exercise.e1_shape;

public class SquareTriangle {
    public static void main(String[] args) {
       // botton-left
        System.out.println("botton-left");
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
        //top-left
        System.out.println("top-left");
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5-i+1; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }
}
