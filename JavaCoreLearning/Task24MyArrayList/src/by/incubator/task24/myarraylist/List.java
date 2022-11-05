package by.incubator.task24.myarraylist;

public interface List <T>{
    void add(T obj);
    void add(int index, T obj);
    void remove(T obj);
    T remove(int index);
    T get(int index);
    T set(int index,T obj);
    int indexOf(T obj);
    void print();
}
