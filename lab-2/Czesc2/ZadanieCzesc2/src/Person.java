// klasy abstrakcyjnej Osoba, składającej się z:
// pól prywatnych: imie (String), nazwisko (String) oraz adres(typ Adres)
// konstruktora umożliwiającego inicjalizacje pól składowych klasy

abstract class Person {
    private String name, surname;
    private Address address;

    public Person(String name, String surname, Address address){
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }
    public void setAddress(Address address){this.address = address;}

    public String getName( ) { return this.name; }
    public String getSurname( ) { return this.surname; }
    public Address getAddress( ){ return this.address; }

}
