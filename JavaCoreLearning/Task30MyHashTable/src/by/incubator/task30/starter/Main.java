package by.incubator.task30.starter;

import by.incubator.task30.customhashmap.CustomHashMap;
import by.incubator.task30.customhashmap.Node;
import by.incubator.task30.customset.CustomHashSet;

public class Main {
    public static void main(String[] args) {
        CustomHashSet<Integer> hashSetCustom = new CustomHashSet<>();
        hashSetCustom.add(21);
        hashSetCustom.add(25);
        hashSetCustom.add(30);
        hashSetCustom.add(33);
        hashSetCustom.add(35);

        //System.out.println("Множество содержит 21 = "+hashSetCustom.contains(21));
        //System.out.println("Множество содержит 51 ="+hashSetCustom.contains(51));

        System.out.print("Множество: ");
        hashSetCustom.display();

        System.out.println("\n\n21 удален: "+hashSetCustom.remove(21));
        System.out.println("22 удален: "+hashSetCustom.remove(22));

        System.out.print("Множество после удаления: ");
        hashSetCustom.display();
}




//------------------Map testing---------------------------
/*CustomHashMap<String, String> head = new CustomHashMap<>();
        head.put("First", "Svyat");
        System.out.println(head.getHashIndex());
        head.put("Second", "Anton");
        System.out.println(head.getHashIndex());
        head.put("Third", "Andrey");
        System.out.println(head.getHashIndex());
        head.put("Fourth", "Nastya");
        System.out.println(head.getHashIndex());
        head.put(null, "Svyat");
        System.out.println(head.getHashIndex());
        head.put(null, "Vova");
        System.out.println(head.getHashIndex());
        System.out.println("Все значения");
        head.display();
        System.out.println("Отработка метода get");
        System.out.println(head.get(null));
        System.out.println(head.get("Second"));
        System.out.println(head.get("First"));
        System.out.println(head.get("wikjf"));
        System.out.println(head.get("Third"));
        System.out.println(head.get("Fourth"));
        head.put(null, "Ivan");
        System.out.println(head.get(null));
        try {
            Node<String, String> removed = head.remove("First");
            System.out.println(removed.getValue());
            Node<String, String> removed4= head.remove("rst");
            System.out.println(removed4.getValue());
        } catch (Exception e){
            System.out.println("Null Pointer Exception: one of the object might be not exist in the hashMap anymore.");
        }*/


    /*CustomHashSet<Integer> hashSetCustom = new CustomHashSet<>();
        hashSetCustom.add(21);
        hashSetCustom.add(25);
        hashSetCustom.add(30);
        hashSetCustom.add(33);
        hashSetCustom.add(35);

        System.out.println("Множество содержит 21 = "+hashSetCustom.contains(21));
        System.out.println("Множество содержит 51 ="+hashSetCustom.contains(51));

        System.out.print("Множество: ");
        hashSetCustom.display();

        System.out.println("\n\n21 удален: "+hashSetCustom.remove(21));
        System.out.println("22 удален: "+hashSetCustom.remove(22));

        System.out.print("Множество после удаления: ");
        hashSetCustom.display();*/
}