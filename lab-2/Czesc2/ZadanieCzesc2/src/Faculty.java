// klasy Wydział, składającej się z:
// pól prywatnych: nazwaWydzialu (String), adres (typ Adres),
// dziekan (typ Pracownik) oraz listaKierunkow (kolekcja elementów typu Kierunek)
// metod:
// konstruktora umożliwiającego inicjalizacje pól składowych klasy
// metody aktualizujNazwe(), która umożliwia zmianę nazwy wydziału
// metody aktualizujDziekana(), która umożliwia zmianę dziekana danego wydziału
// metod dodajKierunek() oraz usunKierunek() umożliwiających dodanie oraz usunięcie kierunków kształcenia na danym wydziale
// metody wyświetl(), która wyświetla na standardowe wyjście informacje o wydziale

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String facultyName;
    private Address address;
    private Employee dean;
    private List<Specialization> specialization_list;

    public Faculty(String facultyName, Address address, Employee dean, List<Specialization> specialization_list){
        this.facultyName = facultyName;
        this.address = address;
        this.dean = dean;
        this.specialization_list = new ArrayList<>(specialization_list);
    }

    public String getFacultyName() {
        return facultyName;
    }

    private String getSpecializationsNames(List<Specialization> array){
        String result = "";

        for(int i = 0; i < array.size() ; i++){
            if(i == array.size() - 1){
                result += array.get(i).getSpecializationName();
            } else {
            result += array.get(i).getSpecializationName() + ", ";
            }
        }

        return result;
    }

    public void updateFacultyName(String new_facultyName){
        this.facultyName = new_facultyName;
    }

    public void updateDean(Employee new_dean){
        this.dean = new_dean;
    }

    public void addSpecialization(Specialization new_specialization){
        this.specialization_list.add(new_specialization);
    }

    public void deleteSpecialization(Specialization specialization){
        this.specialization_list.remove(specialization);
    }

    public void displayData(){
        System.out.println("Faculty: " + this.facultyName + ", at " + this.address + ", Dean: " + this.dean.getName() + " " + this.dean.getSurname() + ", specializations: " + this.getSpecializationsNames(this.specialization_list));
    }

}
