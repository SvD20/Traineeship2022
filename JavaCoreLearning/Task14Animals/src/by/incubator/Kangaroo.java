package by.incubator;

public class Kangaroo extends Animal{

    public Kangaroo(String name, int footNumber, boolean hasMustache) {
        super(name, footNumber, hasMustache);
    }

    public void voice(){
        System.out.println("khe-khe");
    }

    public void move(){
        System.out.println("jump-jump");
    }

    public void isHungry(){
        System.out.println("I want berries");
    }

}
