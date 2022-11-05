package by.incubator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        outOfMemoryErrorMaker();
    }


    public static void stackOverflower(){
        System.out.println("UAHAHAHAHAHAHAHH");
        stackOverflower();
    }

    public static void outOfMemoryErrorMaker(){
        List<Object> objectList = new ArrayList<>();
        //Object object;
        for(int i = 0; i < Long.MAX_VALUE; i++){
            System.out.println("UAHAHAHAHAHAHAHH");
            //object = new Object();
            objectList.add( new Object());
        }
    }


}
