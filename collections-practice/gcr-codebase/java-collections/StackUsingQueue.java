package BridgeLabz_Day30_Collections;

import java.util.*;
public class StackUsingQueue {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    public static void main(String[] args) {
        StackUsingQueue s = new StackUsingQueue();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
    }
    public void push(int x){
        q2.add(x);
        while(!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        Queue<Integer> t = q1;
        q1 = q2;
        q2 = t;
    }
    public int pop(){
        return q1.remove();
    }
    public int top(){
        return q1.peek();
    }
}