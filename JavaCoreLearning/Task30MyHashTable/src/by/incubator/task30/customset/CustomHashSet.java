package by.incubator.task30.customset;

import by.incubator.task30.customhashmap.CustomHashMap;

public class CustomHashSet<T> implements CustomHashSetInterface<T>{

    private CustomHashMap<T,Object> customHashMap;

    public CustomHashSet() {
        this.customHashMap = new CustomHashMap<>();
    }

    @Override
    public void add(T value) {
       customHashMap.put(value,null);
    }

    /*@Override
    public boolean contains(T value) {
        return customHashMap.get(value) != null;
    }*/

    @Override
    public boolean remove(T value) {
        return customHashMap.remove(value) != null;
    }

    @Override
    public void display() {
        customHashMap.display();
    }


}
