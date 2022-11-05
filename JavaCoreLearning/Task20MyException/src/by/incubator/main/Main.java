package by.incubator.main;

import by.incubator.exceptions.EmptyFileException;
import by.incubator.filereader.MyFilereader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
      try(MyFilereader myFilereader = new MyFilereader("./forreading.txt"))
      {
          myFilereader.readFile();
          myFilereader.displayFileLine();
      } catch (IOException | EmptyFileException ex){
            ex.printStackTrace();
      }
    }
}
