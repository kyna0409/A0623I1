package _11_dsa_stack_queue.practice.deploy_queue_using_array;

public class MyQueue {
    private int capacity;
    private int [] queueArr;
    private int head;
    private int tail;
    private int currentSize;
    public MyQueue()
    {

    }
    public MyQueue(int queueSize)
    {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }
    public boolean isQueueFull()
    {
        if(currentSize==capacity)
        {
            return true;
        }else return false;
    }
    public boolean isQueueEmpty()
    {
        if(currentSize==0)
        {
            return true;
        }else return false;
    }
    public void enqueue(int item)
    {
        if(isQueueFull())
        {
            System.out.println("overlơ ! unable to add element : "+item);
        }else
        {
            tail++;
            if(tail==capacity-1)
            {
                tail = 0;
            }
            queueArr[tail]=item;
            currentSize++;
            System.out.println(item+" pushed in to array");
        }
    }
    public void dequeue()
    {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(56);
        queue.enqueue(2);
        queue.enqueue(67);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(24);
        queue.dequeue();
        queue.enqueue(98);
        queue.enqueue(45);
        queue.enqueue(23);
        queue.enqueue(435);
    }
}
