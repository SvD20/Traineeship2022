package autoparklvl10.mystack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;

public class StackImpl<T> implements Stack<T> {

    private int capasity;
    private T [] stackArray;
    private int top;

    public StackImpl(int capasity) {
        this.capasity = capasity;
        this.stackArray = (T[]) new Object[capasity];
        this.top = -1;
    }

    @Override
    public boolean isEmpty() {
        return (top==-1);
    }

    @Override
    public T peek() throws EmptyStackException{
        if(top<0){
            throw new EmptyStackException();
        }
        return stackArray[top];
    }

    @Override
    public T pop() throws EmptyStackException {
        if(top<0){
            throw new EmptyStackException();
        }
        List<T> list = new ArrayList<>(Arrays.asList(stackArray));
        T temp = list.get(top);
        list.remove(top--);
        list.add(null);
        stackArray = (T[]) list.toArray();
        return temp;
    }

    @Override
    public T push(T e) throws StackOverflowError {
        try{
            if(top>=capasity){
            throw new StackOverflowError();
            }
            stackArray[++top] = e;
        }
        catch (ArrayIndexOutOfBoundsException ex){
            throw new StackOverflowError();
        }
        return e;
    }

    @Override
    public void print() {
        for (T temp: stackArray) {
            System.out.println(temp);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(stackArray);
    }
}
