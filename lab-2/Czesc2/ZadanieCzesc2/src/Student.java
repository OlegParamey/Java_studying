// klasy Student, dziedziczącej z klasy Osoba i składającej się z:
// pól prywatnych: numerIndeksu (int), czyAktywny (typ logiczny)
// oraz listaOcen (tablica elementów typu float)

// metod:
// konstruktora umożliwiającego inicjalizacje pól składowych klasy
// metody aktualizujDane(), która umożliwia zmianę imienia oraz nazwiska studenta
// metody aktualizujAdres(), która umożlwia aktualizację adresu studenta
// metody dodajOcene(), która umożliwia dodanie zadanej oceny do listy ocen studenta
// metody srednia(), zwracającej średnią arytmetyczną z ocen studenta
// metody wyświetl(), która wyświetla na standardowe wyjście informacje o studencie

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private int index_number;
    private boolean isActive;
    private List<Float> grades_list;

    public Student(String name, String surname, Address address, int index_number, boolean isActive, List<Float> grades_list){
        super(name, surname, address);
        this.index_number = index_number;
        this.isActive = isActive;
        this.grades_list = new ArrayList<>(grades_list);
    }

    public void updateData(String new_name, String new_surname){
        setName(new_name);
        setSurname(new_surname);
    }

    public void updateAddress(Address new_address){
        setAddress(new_address);
    }

    public void addGrade(Float new_grade){
        this.grades_list.add(new_grade);
    }

    public Float average(){
        float result = 0;
        for ( float grade : this.grades_list ) {
            result += grade;
        }
        return result/this.grades_list.toArray().length;
    }

    public void displayData(){
        System.out.println("Student: " + this.getName() + " " + this.getSurname() + ", " + this.getAddress() + ", index: " + this.index_number + " " + (this.isActive ? "Aktywny student" : "Nieaktywny student")+ " sriednia z ocen: " + this.average());
    }
}
