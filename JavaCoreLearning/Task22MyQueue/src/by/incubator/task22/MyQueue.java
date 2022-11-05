package by.incubator.task22;

import java.util.NoSuchElementException;

public interface MyQueue {

    boolean add(int e) throws IllegalStateException;
    boolean offer(int e);
    int remove() throws NoSuchElementException;
    int poll();
    int element() throws NoSuchElementException;
    int peek();

}
