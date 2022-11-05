package by.incubator.task28.starter;

import by.incubator.task28.mylinkedlist.CustomLinkedList;


public class Main {
    public static void main(String[] args) {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        list.insert(12); //12
        list.insertAtStart(191); //191 12
        list.insertAt(2, 2222); //191 12 2222
        list.deleteAt(2); //191 12
        list.show();
    }

}
