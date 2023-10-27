package _11_dsa_stack_queue.exercise.optional;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String str = "Able was I ere I saw Elba";
       if(check(str))
       {
           System.out.println("Palindrome");
       }else {
           System.out.println("not is Palindrome");
       }

    }
    public static boolean check(String str){
        Queue queue = new LinkedList();
        Stack stack = new Stack();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            queue.offer(str.charAt(i));
        }
        while (!stack.isEmpty())
        {
            if(stack.pop()!=queue.poll())
            {
                return false;
            }
        }
        return true;
    }

}
