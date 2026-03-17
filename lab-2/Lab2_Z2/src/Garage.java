
public class Garage {
    private Car[] list_of_cars;
    private int liczbaMiejsc;

    public Garage (int liczbaMiejsc) {
        this.liczbaMiejsc = liczbaMiejsc;
        this.list_of_cars = new Car[liczbaMiejsc];
    }

    public Garage (){
        this(3);
    }

    public boolean wprowadz(Car car) {
        for (int i = 0; i < list_of_cars.length; i++) {
            if (list_of_cars[i] == null) {
                list_of_cars[i] = car;
                liczbaMiejsc -= 1;
                System.out.println("Dodano: " + car.marka);
                return true;
            }
        }
        System.out.println("Nie mozna dodac nowy samochod - brak wolnych miejsc w garażu!");
        return false;
    }

    public void wyswietl() {
        System.out.println("Garaż (Miejsca: " + liczbaMiejsc + " wolne):");
        for (int i = 0; i < list_of_cars.length; i++) {
            System.out.println("  Miejsce " + (i + 1) + ": " +
                    (list_of_cars[i] != null ? list_of_cars[i].getCarName() : "wolne"));
        }
    }

    public int liczbaWolnychMiejsc(){
        return this.liczbaMiejsc;
    }

    public boolean szukaj(String marka){

        for (int i = 0; i < list_of_cars.length; i++){
            if (list_of_cars[i] != null && marka == list_of_cars[i].getMarka()){
                list_of_cars[i].getData();
                System.out.println("Auta danej marki znajdują się w garażu");
                return true;
            }
        }

        System.out.println("Niema takiego samochodu");
        return false;


    }
}
