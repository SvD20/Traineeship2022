package by.incubator;

public interface Starveable {
    default void isHungry(){
        System.out.println("not hungry");
    }
}
