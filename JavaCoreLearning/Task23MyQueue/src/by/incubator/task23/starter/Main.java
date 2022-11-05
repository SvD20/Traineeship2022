package by.incubator.task23.starter;

import by.incubator.task23.mystack.Stack;
import by.incubator.task23.mystack.StackImpl;
import by.incubator.task23.entitys.Car;

public class Main {

    public static void main(String[] args) {
        Stack stack = new StackImpl(5);
        stack.push(new Car("Mersedes"));
        stack.push(new Car("BMW"));
        stack.push(new Car("Audi"));
        System.out.println(stack.peek());
        stack.pop();
        stack.print();
    }
}
