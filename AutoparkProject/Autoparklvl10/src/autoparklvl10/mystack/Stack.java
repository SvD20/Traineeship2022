package autoparklvl10.mystack;

import java.util.EmptyStackException;

public interface Stack <T>{

     boolean isEmpty();//проверяет не пустой ли стек
     T peek();//показывает верхний элемент стека
     T pop() throws EmptyStackException;///достает из стека верхний элемент
     T push(T e);
     void print();

}
