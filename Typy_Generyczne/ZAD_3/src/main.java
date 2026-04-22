import Exceptions.*;

void main() {
    Scanner keyboard = new Scanner(System.in);

    boolean IsSession = true;
    BankAccount user1;
    try {
        user1 = new BankAccount(-1000.0);
    } catch (NegativeAmountException e) {
        throw new RuntimeException(e);
    }
    while (IsSession) {
        System.out.println("Witaj w systemie zarządzania kontem bankowym!");
        System.out.println("Twój aktualny stan konta: " + user1.getBalance() + " PLN");
        System.out.println("Co chcesz zrobić?");
        System.out.println("1. Wpłata");
        System.out.println("2. Wypłata");
        System.out.println("3. Sprawdzenie salda");
        System.out.println("4. Wyjście");
        System.out.print("Wybierz opcję (1-4):");
        int option = keyboard.nextInt();
        switch (option) {
            case 1:
                try {
                    System.out.print("Podaj kwotę do wpłacenia: (np. 155.42): ");
                    Double kwota = keyboard.nextDouble();
                    System.out.println();
                    user1.deposit(kwota);
                } catch (NegativeAmountException e) {
                    System.out.println("Błąd: " + e.getMessage());
                }
                break;
            case 2:
                try {
                    System.out.print("Podaj kwotę do wypłacenia (np. 155.42): ");
                    Double kwota = keyboard.nextDouble();
                    System.out.println();
                    user1.withdraw(kwota);
                } catch (NegativeAmountException | InsufficientFundsException e) {
                    System.out.println("Błąd: " + e.getMessage());
                }
                break;
            case 3:
                System.out.println("Stan konta: " + user1.getBalance() + " PLN");
                break;
            case 4:
                IsSession = false;
                break;

        }
    }
}
