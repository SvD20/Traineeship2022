public class Main {

    public static void main(String[] args) {
        Class<MyClass> myClass = MyClass.class;
        System.out.println(myClass.getClassLoader());
        System.out.println("Its parent:");
        System.out.println(myClass.getClassLoader().getParent());
        System.out.println("Its parents parent:");
        System.out.println(myClass.getClassLoader().getParent().getParent());

    }
}


//part 1
  /*Class <Main> main = Main.class;
    System.out.println(main.getClassLoader());
    System.out.println("Its parent:");
    System.out.println(main.getClassLoader().getParent());
    System.out.println("Its parents parent:");
    System.out.println(main.getClassLoader().getParent().getParent());*/

//part2
       /* Class<Integer> integer = Integer.class;
        System.out.println(integer.getClassLoader());//null потому что загружается bootstrap*/

//part3
        /*Class<MyClass> myClass = MyClass.class;
        System.out.println(myClass.getClassLoader());
        System.out.println("Its parent:");
        System.out.println(myClass.getClassLoader().getParent());
        System.out.println("Its parents parent:");
        System.out.println(myClass.getClassLoader().getParent().getParent());*/