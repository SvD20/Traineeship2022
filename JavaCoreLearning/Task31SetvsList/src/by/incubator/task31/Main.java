package by.incubator.task31;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();//Integer выводит по порядку добавления
        set.add(21);
        set.add(8);
        set.add(104);
        set.add(57);
        System.out.print("SET OUTPUT: ");
        for (Integer in: set){
            System.out.print(in);
        }
        System.out.println();
        List<String> list = new LinkedList<>();
        list.add("21 ");
        list.add("8 ");
        list.add("104 ");
        list.add("57 ");
        System.out.print("LIST OUTPUT: ");
        for (String in: list){
            System.out.print(in);
        }
    }
}
