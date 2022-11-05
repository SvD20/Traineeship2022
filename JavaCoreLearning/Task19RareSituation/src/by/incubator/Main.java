package by.incubator;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	     Exceptor1 exceptor1 = new Exceptor1();
         exceptor1.throwerExceptions();
         Exceptor2 exceptor2 = new Exceptor2();
         exceptor2.throwerExceptions();
    }
}
