package Transport.Cars;

import Transport.Engines.Silnik;

public class Dostawczy extends Samochod {

    private int ladownosc;

    public Dostawczy(int liczba_drzwi, String model, int predkosc, String kolor, String VIN, String numer_rejestracyjny , int licznik_przejechanych_kilometrow, int cena_za_dzien, int ladownosc, Silnik silnik){
        super( model, kolor, predkosc, liczba_drzwi, VIN, numer_rejestracyjny, licznik_przejechanych_kilometrow, cena_za_dzien, silnik);
        this.ladownosc = ladownosc;
    }

    @Override
    public String toString(){
        return "Dostawczy " + super.toString() + ", ladownosc: " + this.ladownosc;
    }
}
