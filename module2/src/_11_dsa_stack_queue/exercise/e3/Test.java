package _11_dsa_stack_queue.exercise.e3;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.enQueue(10);
        solution.enQueue(9);
        solution.enQueue(1);
        solution.enQueue(100);
        solution.displayQueue();
        solution.deQueue();
        solution.displayQueue();

    }
}
