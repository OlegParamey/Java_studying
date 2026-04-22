package Exceptions;

public class NegativeAmountException extends Exception{
    public NegativeAmountException(Double amount){
        super("Kwota nie może być ujemna: " + amount);
    }
}
