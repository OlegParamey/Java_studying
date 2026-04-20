package Transport.Cars;

import Transport.Engines.Silnik;
import Transport.Pojazd;

public class Samochod extends Pojazd {
    private int liczba_drzwi;
    private String VIN, numer_rejestracyjny;


    public Samochod( String model, String kolor, int predkosc, int liczba_drzwi, String VIN, String numer_rejestracyjny , int licznik_przejechanych_kilometrow, int cena_za_dzien, Silnik silnik){
        super(model, kolor, predkosc, licznik_przejechanych_kilometrow, cena_za_dzien, silnik);
        this.liczba_drzwi = liczba_drzwi;
        this.VIN = VIN;
        this.numer_rejestracyjny = numer_rejestracyjny;
    }

    public int getLiczbaDrzwi(){
        return this.liczba_drzwi;
    }

    public void setLiczbaDrzwi(int liczba_drzwi){
        this.liczba_drzwi = liczba_drzwi;
    }


    @Override
    public String toString(){
        return "Samochod: " + super.toString() + "; Liczba drzwi: " + this.liczba_drzwi;
    }


}
