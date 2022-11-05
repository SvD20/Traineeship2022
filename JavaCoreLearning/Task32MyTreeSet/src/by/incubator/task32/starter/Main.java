package by.incubator.task32.starter;

import by.incubator.task32.customtreeset.CustomTreeSet;

public class Main {
    public static void main(String[] args) {
        CustomTreeSet<Integer> customTreeSet = new CustomTreeSet<>();
        customTreeSet.add(10);
        customTreeSet.add(20);
        customTreeSet.add(30);
        customTreeSet.display();
        System.out.println();
        System.out.println(customTreeSet.contains(10));
        System.out.println(customTreeSet.contains(40));
        System.out.println(customTreeSet.remove(20));
        System.out.println(customTreeSet.remove(70));
        customTreeSet.display();
    }
}
/////