package by.incubator;

public class Horse extends Animal{

    public Horse(String name, int footNumber, boolean hasMustache) {
        super(name, footNumber, hasMustache);
    }

    public void voice(){
        System.out.println("I-go-go");
    }

    public void move(){
        System.out.println("top-top");
    }

    public void isHungry(){
        System.out.println("I want hay");
    }

}
