package _11_dsa_stack_queue.practice.deploy_stack_using_array;

import java.util.EmptyStackException;

public class MyStack {
    private int [] arr;
    private int size;
    private int index;
    public MyStack(int size)
    {
        this.size = size;
        arr = new int [size];
    }
    public boolean isEmpty()
    {
        if(index==0)
        {
            return true;
        }
        return false;
    }
    public boolean isFull()
    {
        if(index==size)
        {
            return true;
        }
        return false;
    }
    public int size()
    {
        return index;
    }
    public void push(int element)
    {
        if(isFull()){
            throw new StackOverflowError("Stack is full");
        }else {
            arr[index]=element;
            index++;
        }
    }
    public int pop() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }

    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(5);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("1. Size of stack after push operations: " + stack.size());
        System.out.printf("2. Pop elements from stack : ");

        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }

        System.out.println("\n3. Size of stack after pop operations : " + stack.size());
    }
}
