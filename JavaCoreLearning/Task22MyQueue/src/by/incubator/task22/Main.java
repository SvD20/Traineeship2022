package by.incubator.task22;

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueueImpl(5);
        myQueue.add(10);
        myQueue.add(20);
        myQueue.add(30);
        System.out.println(myQueue.element());
    }
}
