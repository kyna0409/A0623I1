package _15_Exception_Debug.exercise._e1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        try {
            triangle(a,b,c);

        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
        System.out.println("finished");


    }
    public static void triangle(int a,int b,int c)throws IllegalTriangleException //(1) tuyên bố tại dòng khai báo phương thức rằng nó có thể ném loại ngoại lệ đó (dùng từ khóa throws); (2) tạo một ngoại lệ và ném nó (bằng lệnh throw) tại tình huống thích hợp trong nội dung phương thức.
    {
        if(a<=0||b<=0||c<=0||a+b<=c||b+c<=a||a+c<=b)
        {
            throw new IllegalTriangleException("three a,b,c cannot is side of a triangle");
        }
    }
}
