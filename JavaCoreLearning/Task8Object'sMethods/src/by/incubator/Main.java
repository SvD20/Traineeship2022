package by.incubator;

public class Main {

    public static void main(String[] args) {
     Vector vector1 = new Vector('A',1,1,1);
     Vector vector2 = new Vector('B',2,2,2);
     Vector vector3 = new Vector('C',1,1,1);
     boolean result = vector1.equals(vector3);
     System.out.println("equals: " + result);
     result = vector1 == vector3;
     System.out.println("==: " + result);

     System.out.println(vector1);
     System.out.println(vector2);
     System.out.println(vector3);
    }
}
