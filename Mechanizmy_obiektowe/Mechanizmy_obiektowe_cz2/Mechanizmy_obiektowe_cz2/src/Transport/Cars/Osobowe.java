package Transport.Cars;

import Transport.Engines.Silnik;

public class Osobowe extends Samochod{
    public Osobowe(int liczba_drzwi, String model, int predkosc, String kolor, String VIN, String numer_rejestracyjny , int licznik_przejechanych_kilometrow, int cena_za_dzien, Silnik silnik){
        super( model,
                kolor,
                predkosc,
                liczba_drzwi,
                VIN,
                numer_rejestracyjny,
                licznik_przejechanych_kilometrow,
                cena_za_dzien,
                silnik);

    }

    @Override
    public String toString(){
        return "Osobowy " + super.toString();
    }
}
