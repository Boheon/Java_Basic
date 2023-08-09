package javabasic.chapter10.account;

public class BalanceInsufficientException extends Exception{
    public BalanceInsufficientException(){}

    public BalanceInsufficientException(String message){
        super(message);
    }
}
