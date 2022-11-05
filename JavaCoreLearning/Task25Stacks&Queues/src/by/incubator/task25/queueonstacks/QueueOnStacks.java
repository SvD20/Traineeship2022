package by.incubator.task25.queueonstacks;

public interface QueueOnStacks<T> {
        void push(T obj);
        void peek();
        void size();
        T pop();
}
