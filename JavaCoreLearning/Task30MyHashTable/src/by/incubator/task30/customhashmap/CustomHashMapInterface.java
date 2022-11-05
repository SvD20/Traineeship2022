package by.incubator.task30.customhashmap;

public interface CustomHashMapInterface <K,V> {
    void put(K key,V val);
    V get(K key);
    Node<K,V> remove(K key);
    void display();
}
