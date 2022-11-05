package by.incubator.exceptions;

public class EmptyFileException extends Exception{

    public EmptyFileException(String message, String filePath) {
        super(message + " " + filePath);
    }

    public EmptyFileException(String message, Throwable cause,String filePath) {
        super(message + " " + filePath, cause);
    }



}
