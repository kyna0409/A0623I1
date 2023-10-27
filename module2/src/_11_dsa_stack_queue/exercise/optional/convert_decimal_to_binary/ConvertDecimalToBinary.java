package _11_dsa_stack_queue.exercise.optional.convert_decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        int n = sc.nextInt();
        while(n!=0)
        {
            stack.push(n%2);
            n/=2;
        }

        while (!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
    }

}
