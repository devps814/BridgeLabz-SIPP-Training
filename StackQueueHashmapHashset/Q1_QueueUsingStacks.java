// Q1_QueueUsingStacks.java
// Implement a Queue using two Stacks
import java.util.Stack;

public class Q1_QueueUsingStacks {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int x) {
        stack1.push(x);
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) throw new RuntimeException("Queue is empty");
        return stack2.pop();
    }

    public static void main(String[] args) {
        Q1_QueueUsingStacks q = new Q1_QueueUsingStacks();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue()); // 1
        System.out.println(q.dequeue()); // 2
        q.enqueue(4);
        System.out.println(q.dequeue()); // 3
        System.out.println(q.dequeue()); // 4
    }
}
