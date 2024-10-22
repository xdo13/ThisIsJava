package ch11.sec06;

public class InsufficientException extends Exception{ //예외처리 상속
    public InsufficientException(){
    }

    public InsufficientException(String message){
        super(message);
    }
}
