package by.incubator.task32.customtreeset;

import java.util.Map;
import java.util.TreeMap;

public class CustomTreeSet<T> implements CustomTreeSetInterface<T>{

    private TreeMap<T,Object> treeMap;

    public CustomTreeSet() {
        this.treeMap = new TreeMap<>();
    }

    @Override
    public void add(T value) {
        treeMap.put(value,null);
    }

    @Override
    public boolean contains(T value) {
        return treeMap.containsKey(value);
    }

    @Override
    public boolean remove(T value) {
        return treeMap.remove(value,null);
    }

    @Override
    public void display() {
       for (Map.Entry<T,Object> entry: treeMap.entrySet()){
           System.out.print(entry.getKey());
        }
    }
}
///