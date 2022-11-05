package by.incubator;

public class Main {

    public static void main(String[] args) {
         LaserPrinter printer1 = new LaserPrinter("Samsung",true);
         InjectPrinter printer2 = new InjectPrinter("Canon",false);
         printer1.setStamp("Let's print this text");
         printer1.print();
         printer1.scan();
         printer2.setStamp("Let's print text with colors");
         printer2.print();
         printer2.scan();

    }
}
