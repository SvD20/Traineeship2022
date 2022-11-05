package by.incubator.task33.starter;

import by.incubator.task33.entytis.Car;
import by.incubator.task33.entytis.Cat;
import by.incubator.task33.entytis.Dog;
import by.incubator.task33.interfaces.Converter;

import java.util.*;
import java.util.function.*;


public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[]{new Car("BMW",1000),
                new Car("Mersedes",500), new Car("GAZ",5000),
                new Car("Vaz",2300),new Car("Cadillac",700)};
        Integer[] integers = null;
        //task1_arraySort(cars);
        //arrayOfCarsOutput(cars);
        //task2_arrayFilter(cars);
        //arrrayOfIntegerOutput(task3_arrayFiller(integers,i -> i*i));
        //task4_transform_Dog_into_Cat();
        //task5_even_or_odd(8);
        //task5_even_or_odd(9);
        //task6_consumer(new Car("UAZ",1000));
        //task7_supplier();
        //task8_function("777", Integer::parseInt);
        //task9_unaryOperator(7,integer -> integer*integer);
    }

    //-----------------------------------------------------STATIC METHODS----------------------------------

    public static void arrayOfCarsOutput(Car[] cars){
        for(Car temp:cars){
            System.out.println(temp);
        }
    }

    public static void arrrayOfIntegerOutput(Integer[] integers){
        for(Integer temp:integers){
            System.out.println(temp);
        }
    }


    public static void task1_arraySort(Car[] cars){
        //Comparator<Car> mileageComparator = (Car car1, Car car2) -> car1.compareTo(car2);
        Arrays.sort(cars,(Car car1, Car car2) -> car1.compareTo(car2));
    }

    public static void task2_arrayFilter(Car[] cars){
        Predicate<Car> carPredicate = (Car car) -> car.getMileage()<2000;
        for(Car temp:cars){
            if (carPredicate.test(temp)) {
                System.out.println(temp);
            }
        }
    }

    public static Integer[] task3_arrayFiller(Integer[] integers,Fill fill){
       Integer[] integers1 = new Integer[10];
       for(int i=0; i<integers1.length; i++){
           integers1[i] = fill.fill(i);
       }
       return integers1;
    }

    private interface Fill{
        int fill(int i);
    }

    public static void task4_transform_Dog_into_Cat(){
        Converter <Dog, Cat> converter = x -> new Cat(x.name, x.age, x.weight);
        Dog dog = new Dog("Barbos",5,35);
        Cat cat = converter.convert(dog);
        System.out.println(cat);
    }

    public static void task5_even_or_odd(Integer integer){
        Predicate<Integer> predicate = n -> n%2==0;
        if(predicate.test(integer)){
            System.out.println(integer + " is even");
        }
        else {
            System.out.println(integer + " is odd");
        }
    }

    public static void task6_consumer(Car car){
        Consumer<Car> consumer =  car1 -> car1.setMileage(7777777);
        consumer.accept(car);
        System.out.println(car);
    }

    public static void task7_supplier(){
        Supplier<String> supplier = () -> (forSupplier());
        System.out.println(supplier.get());
    }

    public static String forSupplier(){
        List<String> nameList = new ArrayList<>();
        nameList.add("Elena");
        nameList.add("John");
        nameList.add("Alex");
        nameList.add("Jim");
        nameList.add("Sara");
        return nameList.get((int) (Math.random()*nameList.size()));
    }

    public static void task8_function(String str, Function<String,Integer> function){
        Integer integer = function.apply(str);
        System.out.println(integer);
    }

    public static void task9_unaryOperator(Integer integer, UnaryOperator<Integer> unaryOperator){
        System.out.println(unaryOperator.apply(integer));
    }

}
