package by.incubator.task21;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Car[] cars = new Car[4];
        extracted(cars);
        Arrays.sort(cars,new CarComparator());
        for(Car temp: cars){
            System.out.println(temp);
        }

    }

    private static void extracted(Car[] cars) {
        cars[0] = new Car("BMW", 1250);
        cars[1] = new Car("Mersedes", 2350);
        cars[2] = new Car("Maz",1890);
        cars[3] = new Car("Kamaz", 5000);
    }

}


