package by.incubator.task33.interfaces;

public interface Converter <T,N>{
    N convert(T t);

    static boolean isNotNull(Object t) {
        return t != null;
    }

    default void writeToConsole(T t) {
        System.out.println(t);
    }

}
