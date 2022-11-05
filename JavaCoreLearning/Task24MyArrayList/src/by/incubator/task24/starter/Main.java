package by.incubator.task24.starter;

import by.incubator.task24.myarraylist.ArrayList;
import by.incubator.task24.myarraylist.List;
import by.incubator.task24.entitys.Car;

public class Main {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW"));
        carList.add(new Car("MAZ"));
        carList.add(new Car("Mersedes"));
        carList.add(1,new Car("Maybach"));
        carList.set(2,new Car("Zil"));
        carList.print();
        System.out.println(carList.get(0));
        System.out.println(carList.indexOf(new Car("BMW")));

    }
}
