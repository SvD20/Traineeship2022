package by.incubator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static final String FILE_PATH = "./input.txt";
    private static final String INCORRECT_FILE_PATH = "./input1.txt";

    private static void readFile(String path){
        File file = new File(path);
        try(
                FileInputStream fileInputStream = new FileInputStream(file);
                Scanner scanner = new Scanner(fileInputStream);
        ){
            String fileLine = scanner.nextLine();
            System.out.printf("'%s' read from file '%s''%n'", fileLine, path);
        }
        catch (FileNotFoundException ex){
            System.out.println("FileNotFound exception '" + path + " '");
        } catch (IOException ex){
            System.out.println("I/O exception for '" + path + "'");
        }finally {
            System.out.println("finally method for '" + path + "'");
        }
    }

    public static void main(String[] args) {
        readFile(INCORRECT_FILE_PATH);
        readFile(FILE_PATH);
    }
}
