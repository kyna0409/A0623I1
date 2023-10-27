package _11_dsa_stack_queue.exercise.optional;

import java.util.Stack;

public class Bracket {
    public static boolean checkBracket(String str) {
        str = str.replaceAll(" ", "").toLowerCase();
        char[] s = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : s) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char left = stack.pop();
                if (left != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "s * (s - a) * (s - b) * (s - c)";

        System.out.println(str + " → " + checkBracket(str));
    }
}





