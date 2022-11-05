package by.incubator;

import java.io.IOException;
import java.util.Scanner;

public class Exceptor2 extends Exceptor1{

    public Exceptor2() {
        super();
        try{
            super();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void throwerExceptions()  {
        System.out.println("gygygygy");
    }
}
