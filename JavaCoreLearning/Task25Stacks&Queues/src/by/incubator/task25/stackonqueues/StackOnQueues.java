package by.incubator.task25.stackonqueues;

import by.incubator.task25.myqueue.MyQueue;
import by.incubator.task25.myqueue.MyQueueImpl;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class StackOnQueues <T>{

    MyQueue <T> q1 = new MyQueueImpl<>(5);
    MyQueue <T> q2 = new MyQueueImpl<>(5);

    //Queue<T> q1 = new LinkedList<>();
    //Queue<T> q2 = new LinkedList<>();
    // Stores the top element of stack
    private T top;

    public void push(T obj) {
        // Add element at rear of q1
        q1.add(obj);
        // update top as current element
        top = obj;
    }

    public T top() {
        // Top stores the top of stack
        return top;
    }

    public T pop() {
        int n = q1.size();
        // Shift (n - 1) elements from q1 to q2 and update top as curr
        // element transferred
        for (int i = 0; i < n - 1; i++) {
            T curr = q1.remove();
            q2.add(curr);
            top = curr;
        }
        // q1 contains only 1 element which is top of stack
        // store the element in ele and remove it from q1
        T ele = q1.remove();
        n = q2.size();
        // Again transfer back the elements from q2 to q1
        for (int i = 0; i < n; i++) {
            q1.add(q2.remove());
        }
        // return ele, this is the top of stack
        return ele;
    }

     public boolean empty() {
        // If q1 is empty then stack is empty
        return q1.isEmpty();
    }

    /*public static void main(String[] args) {
        // Example
        push(1);
        push(2);
        System.out.println(top());
        System.out.println(pop());
        System.out.println(empty());
    }*/

}
