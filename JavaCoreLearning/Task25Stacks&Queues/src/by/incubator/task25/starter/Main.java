package by.incubator.task25.starter;

import by.incubator.task25.entitys.Car;
import by.incubator.task25.queueonstacks.QueueOnMyStacksImpl;
import by.incubator.task25.queueonstacks.QueueOnStacks;
import by.incubator.task25.stackonqueues.StackOnQueues;

public class Main {
    public static void main(String[] args) {
        QueueOnStacks<Car> queueOnStacks = new QueueOnMyStacksImpl<>();
        queueOnStacks.push(new Car("BMW"));
        queueOnStacks.push(new Car("Mersedes"));
        queueOnStacks.push(new Car("Maybach"));
        System.out.println(queueOnStacks.pop());
        queueOnStacks.push(new Car("MAZ"));
        System.out.println(queueOnStacks.pop());
        queueOnStacks.size();
        System.out.println(queueOnStacks);
    }
}
 /*QueueOnStacks<Car> queueOnStacks = new QueueOnMyStacksImpl<>();
        queueOnStacks.push(new Car("BMW"));
        queueOnStacks.push(new Car("Mersedes"));
        queueOnStacks.push(new Car("Maybach"));
        System.out.println(queueOnStacks.pop());
        queueOnStacks.push(new Car("MAZ"));
        System.out.println(queueOnStacks.pop());
        queueOnStacks.size();*/


/*StackOnQueues<Car> stackOnQueues = new StackOnQueues<>();
        stackOnQueues.push(new Car("BMW"));
        stackOnQueues.push(new Car("Mersedes"));
        System.out.println(stackOnQueues.top());
        System.out.println(stackOnQueues.pop());
        System.out.println(stackOnQueues.top());
        System.out.println(stackOnQueues.empty());*/