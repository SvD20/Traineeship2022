package by.incubator.task34.starter;

import by.incubator.task34.entytis.People;
import by.incubator.task34.enums.Sex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //-----------------------------------FIRST PART---------------------------
        /*List<String> strings = new ArrayList<>();
        strings.add("a1");
        strings.add("a2");
        strings.add("a3");
        strings.add("a1");
        System.out.println(strings.stream().filter( str -> str.equals("a1")).count());//task1
        System.out.println(strings.stream().findFirst().orElse("0"));//task2
        System.out.println(strings.stream().skip(strings.size()-2).findFirst().orElse("0"));//task3
        strings.stream().distinct().skip(1).forEach(System.out::println);//task4
        strings.stream().filter(str->str.equals("a1")).forEach(System.out::println);//task5
        System.out.println(strings.stream().anyMatch(str->str.equals("a1")));//task6
        System.out.println(strings.stream().noneMatch(str->str.equals("a7")));//task7
        System.out.println(Arrays.toString(strings.stream().mapToInt(str -> Integer.parseInt(str = str.substring(1))).toArray()));//task8
        strings.stream().sorted().forEach(System.out::println);*///task10

        //-----------------------------------SECOND PART------------------------------
        List<People> peoples = Arrays.asList(new People("Basil",16, Sex.MAN),
                new People("Peter",23, Sex.MAN),new People("Helen",42, Sex.WOMAN),
                new People("Ivan",69, Sex.MAN));
        peoples.stream().filter(people -> 17 < people.age && people.age<28).
                forEach(System.out::println);//task1
        System.out.println(peoples.stream().mapToInt(people-> people.age).average());//task2
        System.out.println(peoples.stream().filter(people -> (people.age > 17 && people.age < 56 && people.sex.equals(Sex.WOMAN))||
                (people.age > 17 && people.age < 61 && people.sex.equals(Sex.MAN))).count());//task3
        System.out.println(peoples.stream().min(People::compareTo));//task4
        peoples.stream().sorted((people1,people2) -> people1.sex.compareTo(people2.sex)).forEach(System.out::println);//task5



    }
}
