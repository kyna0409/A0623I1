package _11_dsa_stack_queue.exercise.e3;

public class Solution {
    private int size;
    public Queue q= new Queue();
    public void enQueue(int val)
    {
            Node node = new Node();
            node.data = val;
            if(q.front==null)
            {
                q.front=q.rear=node;
            }else
            {
                q.rear.link = node;
                q.rear=node;
                q.rear.link = q.front;
            }
                size++;
    }
    public void deQueue()
    {
        if(q.front!=null) {
            if (q.front == q.rear) {
                q.front = q.rear = null;
            }else
            {
                q.front =q.front.link;
                q.rear.link = q.front;
            }
            size--;
        }
    }
    public void displayQueue()
    {
        Node node = q.front;
        for (int i = 0; i < size; i++) {
            System.out.println(node.data);
            node = node.link;
        }

    }



}
