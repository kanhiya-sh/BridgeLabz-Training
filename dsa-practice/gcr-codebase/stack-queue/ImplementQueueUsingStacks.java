package BridgeLabz_Day24_StackQueue;

import java.util.Stack;
public class ImplementQueueUsingStacks {
    // here we are creating two stacks
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    // this is adding of data in the queue
    public void enqueue(int data) {
        st1.push(data);
    }
    // now popping the data in the FIFO order
    public int dequeue() {
        if (st1.isEmpty() && st2.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        if (st2.isEmpty()) {
           while(!st1.isEmpty()) {
               st2.push(st1.pop());
           }
        }
        return st2.pop();
    }
    public static void main(String[] args) {
        ImplementQueueUsingStacks queue = new ImplementQueueUsingStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
