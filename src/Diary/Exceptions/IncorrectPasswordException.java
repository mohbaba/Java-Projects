package Diary.Exceptions;

public class IncorrectPasswordException extends RuntimeException{
    public IncorrectPasswordException(String message){
        super((message));
    }
}
