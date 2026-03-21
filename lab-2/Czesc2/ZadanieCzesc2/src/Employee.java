// klasy Pracownik, dziedziczącej z klasy Osoba i składającej się z:
// pól prywatnych: stanowisko (String), tytułNaukowy (String) oraz pensja (float)

// metod:
// konstruktora umożliwiającego inicjalizacje pól składowych klasy
// metody aktualizujPensje(), która umożliwia zmianę pensji pracownika na zadaną wartość
// metody aktualizujTutul(), która umożliwia aktualizacje tytułów pracownika
// metody aktualizujDane(), która umożliwia zmianę imienia oraz nazwiska pracownika
// metody aktualizujAdres(), która umożliwia aktualizację adresu pracownika
// metody wyświetl(), która wyświetla na standardowe wyjście informacje na temat pracownika

public class Employee extends Person {
    private String position, academic_degree;
    private float salary;

    public Employee(String name, String surname, Address address, String position, String academic_degree, float salary){
        super(name, surname, address);
        this.position = position;
        this.academic_degree = academic_degree;
        this.salary = salary;

    }

    public void updateSalary(float new_salary){
        this.salary = new_salary;
    }
    public void updateAcademicDegree(String new_academic_degree){
        this.academic_degree = new_academic_degree;
    }
    public void updateData(String new_name, String new_surname){
        setName(new_name);
        setSurname(new_surname);
    }
    public void updateAddress(Address new_address){
        setAddress(new_address);
    }
    public void displayData(){
        System.out.println("Employee: " + this.getName() + " " + this.getSurname() + ", " + this.getAddress() + ", salary(PLN): "
                + this.salary + ", position: " + this.position + ", academic degree in " + this.academic_degree) ;
    }

    @Override
    public String toString(){
        return this.getName() + " " + this.getSurname() + ", " + this.getAddress() + ", salary(PLN): "
                + this.salary + ", position: " + this.position + ", academic degree in " + this.academic_degree;
    }
}
