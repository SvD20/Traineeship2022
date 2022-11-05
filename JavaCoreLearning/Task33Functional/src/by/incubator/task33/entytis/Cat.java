package by.incubator.task33.entytis;

public class Cat {

    public String name;
    public int age;
    public double weight;

    public Cat(String name,int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  name + ", " + age + ", " + weight;
    }
}
