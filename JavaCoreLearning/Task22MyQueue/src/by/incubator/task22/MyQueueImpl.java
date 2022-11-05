package by.incubator.task22;

import java.util.NoSuchElementException;

public class MyQueueImpl implements MyQueue{

    private int [] array;
    private int capasity;
    private int size;
    private int front;
    private int end;

    public MyQueueImpl(int capasity) {
        this.capasity = capasity;
        this.array =  new int[this.capasity];
        this.end = -1;
        this.front = 0;
        this.size = 0;
    }

    @Override
    public boolean add(int e) throws IllegalStateException {
        if (end == capasity  - 1) {  // если закончилась емкость массива
            throw new IllegalStateException();
        }
        array[++end] = e;
        size++;
        return true;
    }

    @Override
    public boolean offer(int e) {
        if (end == capasity  - 1) {  //если закончилась емкость массива
            return false;
        }
        array[++end] = e;
        size++;
        return true;
    }

    @Override
    public int remove() throws NoSuchElementException {
        if (front == capasity) { // если закончилась емкость массива
            throw new NoSuchElementException();
        }
        int temp = array[front++]; // получаем первый элемент из очереди
        size--; // уменьшаем количество элементов в очереди
        return temp;
    }

    @Override
    public int poll() {
        if (front == capasity) { // если закончилась емкость массива
            return -1; //вместо возвращаемого null
        }
        int temp = array[front++]; // получаем первый элемент из очереди
        size--; // уменьшаем количество элементов в очереди
        return temp;
    }

    @Override
    public int element() throws NoSuchElementException {
        if (front == capasity) { // если закончилась емкость массива, удалили слишком много элементов
            throw new NoSuchElementException();
        }
        int temp = array[front]; // получаем первый элемент из очереди
        return temp;
    }

    @Override
    public int peek() {
        if (front == capasity) { // если закончилась емкость массива, удалили слишком много элементов
            return -1; //вместо возвращаемого null
        }
        int temp = array[front]; // получаем первый элемент из очереди
        return temp;
    }
}
