package BridgeLabz_Day24_StackQueue;

import java.util.*;
public class SortStackUsingRecursion {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(50);
        stack.push(20);
        stack.push(60);
        sortStack(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
    public static void sortStack(Stack<Integer> st) {
        if(!st.isEmpty()) {
            int temp = st.pop();
            sortStack(st);
            insertTemp(st, temp); // here we need to insert the temp(popped) element back at the correct position
        }
    }
    public static void insertTemp(Stack<Integer> st , int tempValue ) {
        if(st.isEmpty() || st.peek() < tempValue){
            st.push(tempValue);
            return;
        }
        int temp = st.pop();
        insertTemp(st, tempValue);
        st.push(temp);
    }
}
