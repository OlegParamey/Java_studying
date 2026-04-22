package Exceptions;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(Double balance, Double amount) {
        super("Brak środków. Saldo: " + balance + ", wymagane: " + amount);
    }
}
