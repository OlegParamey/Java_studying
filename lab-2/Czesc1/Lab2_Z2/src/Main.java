void main() {
    Car honda = new Car("Honda", "Civic", "215", "2.5", "2012");
    Car mazda = new Car("Mazda", "RX7", "437", "3.5", "2007");
    Car volvo = new Car("Volvo", "V60", "220", "2.5", "2017");
    Car nissan = new Car("Nissan", "Silvia", "342", "3", "2017");


    Garage empty_garage = new Garage();
    System.out.println("Liczba wolnych miejsc: " + empty_garage.liczbaWolnychMiejsc());
    empty_garage.wyswietl();
    empty_garage.szukaj("Honda");

    empty_garage.wprowadz(honda);

    System.out.println("Liczba wolnych miejsc: " + empty_garage.liczbaWolnychMiejsc());

    empty_garage.szukaj("Honda");

    empty_garage.wyswietl();

    empty_garage.wprowadz(mazda);

    empty_garage.wyswietl();

    empty_garage.wprowadz(volvo);

    empty_garage.wyswietl();

    empty_garage.wprowadz(nissan);

    empty_garage.wyswietl();
}
