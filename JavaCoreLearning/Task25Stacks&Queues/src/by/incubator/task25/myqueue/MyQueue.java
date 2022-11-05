package by.incubator.task25.myqueue;

import java.util.NoSuchElementException;

public interface MyQueue <T>{

    boolean add(T e) throws IllegalStateException;
    boolean offer(T e);
    T remove() throws NoSuchElementException;
    T poll();
    T element() throws NoSuchElementException;
    T peek();
    int size();
    boolean isEmpty();

}
