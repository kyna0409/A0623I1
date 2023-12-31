package _08_clean_code_refactoring.practice;

import java.util.Scanner;

public class b1 {
    public static final char ADDITION= '+';
    public static final char SUBTRACTION= '-';
    public static final char MULTIPLICATION= '*';
    public static final char DIVISION= '/';
    public static int calculate(int firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOperand + secondOperand;
            case SUBTRACTION:
                return firstOperand - secondOperand;
            case MULTIPLICATION:
                return firstOperand * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(calculate(5,6,ADDITION));

    }
}
