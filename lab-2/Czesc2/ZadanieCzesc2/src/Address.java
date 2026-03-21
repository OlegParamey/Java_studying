// klasy Adres, składającej się z:
// pól prywatnych: miasto (String), ulica (String), numer (int) oraz kodPocztowy (String)

// metod:
// konstruktora umożliwiającego inicjalizacje pól składowych klasy
// metody wyświetl(), która wyświetla na standardowe wyjście informacje o adresie

public class Address {

    private String city, street, zip_code;
    private int number;

    public Address(String city, String street, String zip_code, int number){
        this.city = city;
        this.street = street;
        this.zip_code = zip_code;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Address: " + this.city + ", " + this.zip_code + ", " + this.street + " " + this.number ;
    }

    public void displayData(){
        System.out.println("Address: " + this);
    }
}
