package by.incubator.task25.queueonstacks;

import by.incubator.task25.mystack.StackImpl;

import java.util.Stack;

public class QueueOnMyStacksImpl <T> implements QueueOnStacks<T>{

    //Stack<T> stackA = new StackImpl<>(3);
    //Stack<T> stackB = new StackImpl<>(3);

    Stack<T> stackA = new Stack<>(); //стек, в который мы пушим элементы
    Stack<T> stackB = new Stack<>();//стек-буфер(в нем элементы, которые надо перевернуть)

    @Override
    public void push(T obj) {
        if (stackA.isEmpty()){
            stackA.push(obj);
        }else{
            while (!stackA.isEmpty())
                stackB.push(stackA.pop());
            stackA.push(obj);
            while (!stackB.isEmpty())
                stackA.push(stackB.pop());
        }
    }

    @Override
    public void peek() {
        if (!stackA.isEmpty())
            System.out.println(stackA.peek());
    }

    @Override
    public void size() {
        System.out.println(stackA.size());
    }

    @Override
    public T pop() {
        if (!stackA.isEmpty()){
            return stackA.pop();
        }
        return null;
    }

    @Override
    public String toString() {
        return "QueueOnMyStacksImpl{" +
                "stackA=" + stackA;
    }

}
