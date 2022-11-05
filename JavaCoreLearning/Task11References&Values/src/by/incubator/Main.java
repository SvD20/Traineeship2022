package by.incubator;

public class Main {

    public static void main(String[] args) {
	   Dog aDog = new Dog("Max");
    Dog oldDog = aDog;
    foo(aDog);
    System.out.println(aDog.getName());
    System.out.println(oldDog.getName());
    System.out.println(aDog == oldDog);
    }

    public static void foo(Dog d){
        System.out.println(d.getName().equals("Max"));
        d.setName("Fifi");
        System.out.println(d.getName().equals("Fifi"));
    }


    public static void incrementInteger(Integer integer){
        integer+=1;//судя по всему происходит создание нового объекта в куче с полем а=7++=8
        System.out.println(integer);
    }


}




 /*Integer a = 7;
        incrementInteger(a);
        System.out.println(a);*/
