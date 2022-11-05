package by.incubator;

public class Dragonfly extends Animal{
    public Dragonfly(String name, int footNumber, boolean hasMustache) {
        super(name, footNumber, hasMustache);
    }

    public void voice(){
        System.out.println("bj-w-w");
    }

    public void isHungry(){
        System.out.println("I want insects");
    }

}
