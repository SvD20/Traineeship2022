package by.incubator.task24.myarraylist;

import java.util.Arrays;

public class ArrayList <T> implements List<T> {

    private T[] elementData;
    private int size;

    public ArrayList(int initCapcity) {
        if (initCapcity < 0) {
            throw new IllegalArgumentException("емкость должна быть больше 0");
        }
        elementData = (T[]) new Object[initCapcity];
    }

    public ArrayList() {
        elementData = (T[]) new Object[10];
    }

    @Override
    public void add(T obj) {
        grow(size + 1);
        elementData[size++] = obj;
    }

    @Override
    public void add(int index,T obj) {
        rangeCheckForAdd(index);
        grow(size + 1);
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = obj;
        size++;
    }

    @Override
    public void remove(Object obj) {
        if (obj == null) {
            for (int i = 0; i < size; i++) {
                if (elementData[i] == null) {
                    fastRemove(i);
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (obj.equals(elementData[i])) {
                    fastRemove(i);
                }
            }
        }
    }

    @Override
    public T remove(int index) {
        rangeCheck(index);
        int movedNum = size - index - 1;
        T oldElement = getObjectByIndex(index);
        System.arraycopy(elementData, index + 1, elementData, index, movedNum);
        elementData[--size] = null;
        return oldElement;
    }

    @Override
    public T get(int index) {
        rangeCheck(index);
        return getObjectByIndex(index);
    }

    @Override
    public T set(int index, T obj) {
        rangeCheck(index);
        T oldElement = getObjectByIndex(index);
        elementData[index] = obj;
        return oldElement;
    }

    @Override
    public int indexOf(T obj) {
        if (obj == null) {
            for (int i = 0; i < size; i++) {
                if (elementData[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (obj.equals(elementData[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public void print() {
        for (T temp: this.elementData){
            System.out.println(temp);
        }
    }


    private void grow(int minCapacity) {
        if (minCapacity <= elementData.length) {
            return;
        }
        int newCapacity = minCapacity +  5;
        this.elementData = Arrays.copyOf(this.elementData, newCapacity);
    }


    private T getObjectByIndex(int index) {
        return (T) elementData[index];
    }

    private void fastRemove(int index) {
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }
        elementData[--size] = null;
    }

    private void rangeCheck(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException("index:" + index + ",size:" + size);
    }

    private void rangeCheckForAdd(int index) {
        if (index > size || index < 0)
            throw new IndexOutOfBoundsException("index:" + index + ",size:" + size);
    }
}

