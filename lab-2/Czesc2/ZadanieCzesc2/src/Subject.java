// klasy Przedmiot, składającej się z:
// pól prywatnych: nazwaPrzedmiotu (String), punktyEcts (int),
// sylabus (String) oraz koordynator (typ Pracownik)

// metod:
// konstruktora umożliwiającego inicjalizacje pól składowych klasy
// metody aktualizujSylabus(), która aktualizuje sylabus na zadaną wartość
// metody aktualizujPunkty(), która aktualizuje punkty ECTS przedmiotu na zadaną wartość
// metody zmienKoordynatora(), która zmienia koordynatora przedmiotu na pracownika zadanego jako argument wywołania
// metody wyświetl(), która wyświetla na standardowe wyjście informacje o przedmiocie

public class Subject {
    private String subject_name, syllabus;
    private int ECTS_point;
    private Employee coordinator;

    public Subject(String subject_name, String syllabus, int ECTS_point, Employee coordinator){
        this.subject_name = subject_name;
        this.syllabus = syllabus;
        this.ECTS_point = ECTS_point;
        this.coordinator = coordinator;
    }

    public String getSubjectName(){
        return this.subject_name;
    }

    public void updateSyllabus(String new_syllabus){
        this.syllabus = new_syllabus;
    }

    public void updateECTSPoint(int new_ECTS_point){
        this.ECTS_point = new_ECTS_point;
    }

    public void changeCoordinator(Employee new_coordinator){
        this.coordinator = new_coordinator;
    }

    public void displayData(){
        System.out.println("Subject: " + this.subject_name + ", syllabus: "
                + this.syllabus + ", ECTS Point: " + this.ECTS_point
                + ", Coordinator: " + this.coordinator.getName() + " " + this.coordinator.getSurname());
    }

}
