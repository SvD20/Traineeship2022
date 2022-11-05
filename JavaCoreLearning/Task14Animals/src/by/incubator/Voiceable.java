package by.incubator;

public interface Voiceable {
     default void voice(){
         System.out.println("voice");
     }
}
