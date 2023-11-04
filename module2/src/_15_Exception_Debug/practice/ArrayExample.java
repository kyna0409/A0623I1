package _15_Exception_Debug.practice;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static Integer[]createRandom()
    {
        Random random = new Random();
        Integer [] integers = new Integer[10];
        System.out.println("Danh sách phần tử của mảng: " );
        for (int i = 0; i < 10; i++) {
            integers[i] = random.nextInt(10);
        }
        return integers;
    }

    public static void main(String[] args) {
        Integer[] arr = createRandom();
        Scanner scaner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scaner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số 5" + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
        System.out.println("hdgf");
}

}
