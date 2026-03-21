
import java.util.ArrayList;

void main() {

    System.out.println();

    Address address1 = new Address("Warsaw", "Marszałkowska", "00-001", 15);
    Address address2 = new Address("Krakow", "Floriańska", "31-021", 42);
    Address address3 = new Address("Katowice", "Staromiejska", "40-013", 7);

    address2.displayData();

    System.out.println();
    System.out.println("---------------------------------------------------------------------------------");
    System.out.println();

    Student student1 = new Student("Jan", "Kowalski", address1, 123456, true,
            new ArrayList<>(List.of(4.5f, 3.0f, 5.0f, 4.0f)));

    Student student2 = new Student("Anna", "Nowak", address2, 234567, true,
            new ArrayList<>(List.of(5.0f, 4.5f, 5.0f, 4.5f)));

    Student student3 = new Student("Piotr", "Wiśniewski", address3, 345678, false,
            new ArrayList<>(List.of(2.0f, 3.0f, 2.5f, 3.5f)));

    Student student4 = new Student("Maria", "Wójcik", address1, 456789, true,
            new ArrayList<>(List.of(3.5f, 4.0f, 3.0f, 4.5f)));

    Student student5 = new Student("Tomasz", "Kaminski", address2, 567890, false,
            new ArrayList<>(List.of(2.5f, 2.0f, 3.0f, 2.5f)));

    student3.displayData();
    student3.updateData("Lukasz", "Herc");
    System.out.println(student3.average());
    student3.addGrade(4.5f);
    System.out.println(student3.average());
    student3.displayData();
    student3.updateAddress(address1);
    student3.displayData();

    System.out.println();
    System.out.println("---------------------------------------------------------------------------------");
    System.out.println();

    Employee employee1 = new Employee("Adam", "Nowak", address1, "Professor", "PhD", 8500.0f);
    Employee employee2 = new Employee("Katarzyna", "Kowalska", address2, "Assistant Professor", "MSc", 5500.0f);
    Employee employee3 = new Employee("Marek", "Zielinski", address3, "Lecturer", "PhD", 6200.0f);
    Employee employee4 = new Employee("Ewa", "Wiśniewska", address1, "Dean", "Professor", 12000.0f);
    Employee employee5 = new Employee("Paweł", "Jabłoński", address2, "Lab Technician", "BSc", 4200.0f);

    employee2.displayData();
    employee2.updateAcademicDegree("PhD");
    employee2.updateSalary(8000.0f);
    employee2.updateData("Kacper", "Duda");
    employee2.updateAddress(address1);
    employee2.displayData();

    System.out.println();
    System.out.println("---------------------------------------------------------------------------------");
    System.out.println();

    Subject subject1 = new Subject("Mathematics", "Calculus, linear algebra, statistics", 6, employee1);
    Subject subject2 = new Subject("Physics", "Mechanics, thermodynamics, electromagnetism", 5, employee2);
    Subject subject3 = new Subject("Computer Science", "Algorithms, data structures, complexity", 6, employee3);
    Subject subject4 = new Subject("Chemistry", "Organic and inorganic chemistry basics", 4, employee4);
    Subject subject5 = new Subject("English", "Academic writing and communication", 2, employee5);
    Subject subject6 = new Subject("Databases", "SQL, relational models, normalization", 5, employee1);
    Subject subject7 = new Subject("Networking", "TCP/IP, routing, network security", 4, employee2);
    Subject subject8 = new Subject("Statistics", "Probability, distributions, hypothesis testing", 5, employee3);
    Subject subject9 = new Subject("Philosophy", "Ethics, logic, epistemology", 2, employee4);
    Subject subject10 = new Subject("Programming", "Java, OOP, design patterns", 6, employee5);
    Subject subject11 = new Subject("Artificial Intelligence", "Basic AI concepts", 4, employee1);

    subject11.displayData();
    subject11.updateSyllabus("Machine learning, neural networks, search algorithms");
    subject11.updateECTSPoint(6);
    subject11.changeCoordinator(employee2);
    subject11.displayData();

    System.out.println();
    System.out.println("---------------------------------------------------------------------------------");
    System.out.println();

    Specialization spec1 = new Specialization(
            "Computer Science",
            employee1,
            new ArrayList<>(List.of(subject3, subject6, subject7, subject10)),
            new ArrayList<>(List.of(student1, student2))
    );

    Specialization spec2 = new Specialization(
            "Mathematics",
            employee2,
            new ArrayList<>(List.of(subject1, subject8, subject2)),
            new ArrayList<>(List.of(student3, student4))
    );

    Specialization spec3 = new Specialization(
            "Artificial Intelligence",
            employee3,
            new ArrayList<>(List.of(subject10, subject11, subject8, subject3)),
            new ArrayList<>(List.of(student1, student5))
    );

    Specialization spec4 = new Specialization(
            "Natural Sciences",
            employee4,
            new ArrayList<>(List.of(subject2, subject4, subject8)),
            new ArrayList<>(List.of(student2, student3))
    );

    Specialization spec5 = new Specialization(
            "Humanities",
            employee5,
            new ArrayList<>(List.of(subject5, subject9)),
            new ArrayList<>(List.of(student4, student5))
    );

    spec1.displayData();
    spec1.addSubject(subject9);
    spec1.deleteSubject(subject6);
    spec1.updateName("Computer Science and Engineering");
    spec1.updateHead(employee2);
    spec1.addStudent(student3);
    spec1.deleteStudent(student1);
    spec1.displayData();

    System.out.println();
    System.out.println("---------------------------------------------------------------------------------");
    System.out.println();

    Faculty faculty1 = new Faculty(
            "Faculty of Computer Science and Mathematics",
            address1,
            employee1,
            new ArrayList<>(List.of(spec1, spec2, spec3))
    );

    Faculty faculty2 = new Faculty(
            "Faculty of Natural Sciences",
            address2,
            employee4,
            new ArrayList<>(List.of(spec4))
    );

    Faculty faculty3 = new Faculty(
            "Faculty of Humanities",
            address3,
            employee2,
            new ArrayList<>(List.of(spec5))
    );

    faculty1.displayData();
    faculty1.updateFacultyName("Faculty of Computer Science, Mathematics and AI");
    faculty1.updateDean(employee3);
    faculty1.addSpecialization(spec4);
    faculty1.deleteSpecialization(spec2);
    faculty1.displayData();

    System.out.println();
    System.out.println("---------------------------------------------------------------------------------");
    System.out.println();

    University university1 = new University(
            "University of Warsaw",
            address1,
            employee1,
            new ArrayList<>(List.of(employee2, employee3)),
            new ArrayList<>(List.of(faculty1, faculty2))
    );

    University university2 = new University(
            "Jagiellonian University",
            address2,
            employee4,
            new ArrayList<>(List.of(employee1, employee5)),
            new ArrayList<>(List.of(faculty2, faculty3))
    );

    University university3 = new University(
            "Silesian University of Technology",
            address3,
            employee3,
            new ArrayList<>(List.of(employee2, employee4)),
            new ArrayList<>(List.of(faculty1, faculty3))
    );

    university1.displayData();
    university1.updateName("University of Warsaw and Technology");
    university1.updateRector(employee5);
    university1.addViseRector(employee4);
    university1.deleteViseRector(employee2);
    university1.addStudent(faculty3);
    university1.deleteStudent(faculty2);
    university1.displayData();

    System.out.println();
    System.out.println("---------------------------------------------------------------------------------");
    System.out.println();


}
