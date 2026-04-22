import Exceptions.*;

public class BankAccount {
    private Double balance;

    public BankAccount(Double balance) throws NegativeAmountException {
        if (balance < 0) throw new NegativeAmountException(balance);
        this.balance = balance;
    }

    public BankAccount(){
        this.balance = 0.0;
    }

    public void deposit(Double amount) throws NegativeAmountException {
        if(amount < 0 ) throw new NegativeAmountException(amount);
        balance += amount;
        System.out.print("Wpłacono: " + amount + " | Saldo: " + balance);
    }

    public void withdraw(Double amount) throws InsufficientFundsException, NegativeAmountException {
        if (amount < 0 ) throw new NegativeAmountException(amount);
        if (amount > balance) throw new InsufficientFundsException(balance, amount);
        balance -= amount;
        System.out.println("Wypłacono: " + amount + " | Saldo: " + balance);
    }

    public Double getBalance() {
        return balance;
    }
}
