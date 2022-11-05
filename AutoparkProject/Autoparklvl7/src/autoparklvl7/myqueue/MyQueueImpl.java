package autoparklvl7.myqueue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyQueueImpl<T> implements MyQueue<T>{

    private T [] array;
    private int capasity;
    private int size;
    private int front;
    private int end;

    public MyQueueImpl(int capasity) {
        this.capasity = capasity;
        this.array = (T[]) new Object[this.capasity];
        this.end = -1;
        this.front = 0;
        this.size = 0;
    }

    @Override
    public boolean add(T e) throws IllegalStateException {
        if (end == capasity  - 1) {  // если закончилась емкость массива
            throw new IllegalStateException();
        }
        array[++end] = e;
        size++;
        return true;
    }

    @Override
    public boolean offer(T e) {
        if (end == capasity  - 1) {  //если закончилась емкость массива
            return false;
        }
        array[++end] = e;
        size++;
        return true;
    }

    @Override
    public T remove() throws NoSuchElementException {
        if (front == capasity) { // если закончилась емкость массива
            throw new NoSuchElementException();
        }
        T temp = array[front++]; // получаем первый элемент из очереди
        size--; // уменьшаем количество элементов в очереди
        return temp;
    }

    @Override
    public T poll() {
        if (front == capasity) { // если закончилась емкость массива
            return null;
        }
        T temp = array[front++]; // получаем первый элемент из очереди
        size--; // уменьшаем количество элементов в очереди
        return temp;
    }

    @Override
    public T element() throws NoSuchElementException {
        if (front == capasity) { // если закончилась емкость массива, удалили слишком много элементов
            throw new NoSuchElementException();
        }
        T temp = array[front]; // получаем первый элемент из очереди
        return temp;
    }

    @Override
    public T peek() {
        if (front == capasity) { // если закончилась емкость массива, удалили слишком много элементов
            return null;
        }
        T temp = array[front]; // получаем первый элемент из очереди
        return temp;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size <= 0;
    }

    @Override
    public String toString() {
        return  Arrays.toString(array);
    }
}
