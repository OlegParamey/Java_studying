// klasy Kierunek, składającej się z:
// pól prywatnych: nazwaKierunku (String), kierownik (typ Pracownik)
// oraz listaPrzedmiotow (lista elementów typu Przedmiot)
// oraz listaStudentow (kolekcja elementów typu Student)

// metod:
// konstruktora umożliwiającego inicjalizacje pól składowych klasy
// metody dodajPrzedmiot(), która dodaje zadany przedmiot to listy
// metody usunPrzedmiot(), która usuwa zadany przedmiot z listy
// metody aktualizujNazwe(), która umożliwia zmienić nazwę kierunku na zadaną wartość
// metody aktualizujKierownika(), która umożliwia zmianę kierownika danego kierunku
// metod dodajStudenta() oraz usunStudenta() umożliwiających dodanie oraz usunięcie studenta
// metody wyświetl(), która wyświetla na standardowe wyjście informacje o kierunku

import java.util.ArrayList;
import java.util.List;

public class Specialization {
    private String specialization_name;
    private Employee head;
    private List<Subject> subjects_list;
    private List<Student> students_list;

    public Specialization(String specialization_name, Employee head, List<Subject> subjects_list, List<Student> students_list){
        this.specialization_name = specialization_name;
        this.head = head;
        this.subjects_list = new ArrayList<>(subjects_list);
        this.students_list = new ArrayList<>(students_list);
    }

    public String getSpecializationName(){
        return this.specialization_name;
    }

    private String getSubjectNames(List<Subject> array) {
        String result = "";
        for (int i = 0; i < array.size(); i++) {
            if (i == array.size() - 1) {
                result += array.get(i).getSubjectName();
            } else {
                result += array.get(i).getSubjectName() + ", ";
            }
        }
        return result;
    }

    private String getStudentNames(List<Student> array) {
        String result = "";
        for (int i = 0; i < array.size(); i++) {
            if (i == array.size() - 1) {
                result += array.get(i).getName() + " " + array.get(i).getSurname();
            } else {
                result += array.get(i).getName() + " " + array.get(i).getSurname() + ", ";
            }
        }
        return result;
    }

    public void addSubject(Subject new_subject){
        subjects_list.add(new_subject);
    }
    public void deleteSubject(Subject subject){
        subjects_list.remove(subject);
    }

    public void updateName(String new_name){
        this.specialization_name=new_name;
    }

    public void updateHead(Employee new_head){
        this.head = new_head;
    }

    public void addStudent(Student new_student){
        students_list.add(new_student);
    }
    public void deleteStudent(Student student){
        students_list.remove(student);
    }

    public void displayData(){
        System.out.println("Specialization: " + this.specialization_name + ", head is " + this.head.getName() + " " + this.head.getSurname() + ", subjects: " + this.getSubjectNames(this.subjects_list) + ", students: " + this.getStudentNames(this.students_list));
    }
}
