package by.incubator.task30.customhashmap;

import java.util.Objects;

public class Node <K,V>{
    private final K key;
    private V value;
    Node<K,V> next;
    //private int hash;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
        // this.hash = key.hashCode();
    }


    public K getKey(){
        return key;
    }

    public V getValue() {
        return value;
    }

    public void  setValue(V value){
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node<?, ?> node = (Node<?, ?>) o;
        return Objects.equals(getKey(), node.getKey());
    }

    @Override
    public int hashCode() {
        if(this.key == null ){
            return 0;
        }else {
            return Objects.hash(getKey());
        }
    }
}
