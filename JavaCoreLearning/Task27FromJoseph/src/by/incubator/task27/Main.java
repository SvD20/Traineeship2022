package by.incubator.task27;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        //Scanner scanner = new Scanner(System.in);
        //int size = scanner.nextInt();
        List<Integer> circle = new LinkedList<>();
        for(int i = 0; i<5;i++){
            circle.add(i);
        }
        /*for (Integer integer: circle){
            System.out.print(integer);
        }*/
        while (circle.size()!=1){
            for(int i=0; i< circle.size();i++){
                circle.remove(1);
            }
        }
        //System.out.println();
        System.out.println(circle);
        long endTime = System.nanoTime();
        System.out.println ("Время выполнения программы: "+ (endTime-startTime) +  " нанос");
    }

}

/*Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        List<Integer> circle = new ArrayList<>(size);
        for(int i = 0; i<size;i++){
            circle.add(i+1);
        }
        for (Integer integer: circle){
            System.out.print(integer);
        }
        while (circle.size()!=1){
            for(int i=0; i< circle.size();i++){
                circle.remove(1);
            }
        }
        System.out.println();
        System.out.print(circle);*/