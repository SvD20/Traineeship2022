package by.incubator.filereader;

import by.incubator.exceptions.EmptyFileException;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MyFilereader implements Closeable {

   private final String FILE_PATH;
   private final FileInputStream fileInputStream;
   private final Scanner scanner;
   private String fileLine;

   public MyFilereader(String FILE_PATH) throws FileNotFoundException {
      this.FILE_PATH = FILE_PATH;
      this.fileInputStream = new FileInputStream(FILE_PATH);
      this.scanner = new Scanner(fileInputStream);

   }

   public void readFile() throws EmptyFileException{
      try {
         this.fileLine = this.scanner.nextLine();
      }
      catch (NoSuchElementException ex){
         throw new EmptyFileException("Файл по следующему пути - пустой: ",ex, this.FILE_PATH);
      }
   }

   public void displayFileLine() throws EmptyFileException{
      if(this.fileLine.isEmpty()){
         throw new EmptyFileException("Файл по следующему пути - пустой: ", this.FILE_PATH);
      }
      else{
         System.out.println(this.fileLine);;
      }
   }

   @Override
   public void close() {
      try{
         fileInputStream.close();
         scanner.close();
      }
      catch (IOException e){
         try {
            throw new EmptyFileException("Файл по следующему пути - пустой: ", e, this.FILE_PATH);
         } catch (EmptyFileException ex) {
            ex.printStackTrace();
         }
      }

   }



}
