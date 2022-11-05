package by.incubator.task28.mylinkedlist;

public interface MyLinkedList <T>{
     void insert(T data);
     void insertAtStart(T data);
     void insertAt(int index,T data);
     void deleteAt(int index);
     void show();
}
