package by.incubator.task34.entytis;

import by.incubator.task34.enums.Sex;

public class People implements Comparable<People> {
    public String name;
    public int age;
    public Sex sex;

    public People(String name, int age,Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return name + ", " + age +
                ", " + sex;
    }

    @Override
    public int compareTo(People anotherPeople) {
        if(this.age>anotherPeople.age){
            return 1;
        }
        else{
            if(this.age<anotherPeople.age){
                return -1;
            }
            return 0;
        }
    }

}
