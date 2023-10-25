package _11_dsa_stack_queue.exercise;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class e1_reserve {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        LinkedList<String> strings = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(integers.get(i) + " ");
            ;
        }
        reserveInteger(integers);
        for (int i = 0; i < 10; i++) {
            System.out.print(integers.get(i) + " ");
            ;
        }
        for (int i = 0; i < 5; i++) {
            String n = sc.nextLine();
            strings.add(n);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(strings.get(i) + " ");
        }
        reserveString(strings);
        for (int i = 0; i < 5; i++) {
            System.out.print(strings.get(i) + " ");
        }
    }

    public static void reserveInteger(LinkedList<Integer> list) {
        Stack<Integer> stack = new Stack<>();
        for (Integer value : list) {
            stack.push(value);
        }
        list.clear();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
    }

    public static void reserveString(LinkedList<String> list) {
        Stack<String> stack = new Stack<>();
        for (String value : list) {
            stack.push(value);
        }
        list.clear();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
    }

}
