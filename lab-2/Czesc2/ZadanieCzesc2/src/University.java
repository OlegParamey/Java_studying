// klasy Uczelnia, składającej się z:
// pól prywatnych: nazwaUczelni (String), adres (typ Adres),
// rektor (typ Pracownik), listaProrektorow (kolekcja elementów typu Pracownik),
// listaWydzialow (kolekcja elementów typu Wydzial)

// metod:
// konstruktora umożliwiającego inicjalizacje pól składowych klasy
// metody aktualizujNazwe(), która umożliwia zmianę nazwy wydziału
// metody aktualizujRektora(), która umożliwia zmianę dziekana danego wydziału
// metod dodajProrektora() oraz usunProrektora() umożliwiających dodanie oraz usunięcie informacji na temat dziekanów
// metod dodajWydzial() oraz usunWydzial() umożliwiających dodawanie oraz usuwanie wydziałów z listy
// metody wyświetl(), która wyświetla na standardowe wyjście informacje o uczelni

import java.util.ArrayList;
import java.util.List;

public class University {
    private String university_name;
    private Address address;
    private Employee rector;
    private List<Employee> vice_rectors_list;
    private List<Faculty> faculties_list;

    public University(String university_name, Address address, Employee rector,
     List<Employee> vice_rectors_list, List<Faculty> faculties_list){
        this.university_name = university_name;
        this.address = address;
        this.rector = rector;
        this.vice_rectors_list = new ArrayList<>(vice_rectors_list);
        this.faculties_list = new ArrayList<>(faculties_list);
    }

    private String getFacultiesNames(List<Faculty> array){
        String result = "";

        for(int i = 0; i < array.size() ; i++){
            if(i == array.size() - 1){
                result += array.get(i).getFacultyName();
            } else {
                result += array.get(i).getFacultyName() + ", ";
            }
        }

        return result;
    }

    private String getViceRectorsNames(List<Employee> array){
        String result = "";

        for(int i = 0; i < array.size() ; i++){
            if(i == array.size() - 1){
                result += array.get(i).getName() + " " + array.get(i).getSurname();
            } else {
                result += array.get(i).getName() + " " + array.get(i).getSurname() + ", ";
            }
        }

        return result;
    }

    public void updateName(String new_name){
        this.university_name = new_name;
    }

    public void updateRector(Employee new_rector){
        this.rector = new_rector;
    }

    public void addViseRector(Employee new_vice_rector){
        vice_rectors_list.add(new_vice_rector);
    }
    public void deleteViseRector(Employee vice_rector){
        vice_rectors_list.remove(vice_rector);
    }

    public void addStudent(Faculty new_faculty){
        faculties_list.add(new_faculty);
    }
    public void deleteStudent(Faculty faculty){
        faculties_list.remove(faculty);
    }

    public void displayData(){
        System.out.println("University: " + this.university_name + ", at " + this.address
                + ", rector is " + this.rector.getName() + " " + this.rector.getSurname()
            + ", vice rectors: " + this.getViceRectorsNames(this.vice_rectors_list) + ", faculties: " + this.getFacultiesNames(this.faculties_list));
    }
}
