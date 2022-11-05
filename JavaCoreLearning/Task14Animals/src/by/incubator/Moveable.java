package by.incubator;

public interface Moveable {
    default void move(){
        System.out.println("movement");
    }
}
