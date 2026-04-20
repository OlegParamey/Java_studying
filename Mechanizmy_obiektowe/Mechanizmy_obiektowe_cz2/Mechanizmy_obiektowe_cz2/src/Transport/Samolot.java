package Transport;

import Transport.Engines.Silnik;

public class Samolot extends Pojazd {

    private int liczba_miejsc;

    public Samolot(String model, int predkosc, String kolor, int licznik_przejechanych_kilometrow, int cena_za_dzien, Silnik silnik, int liczba_miejsc){
        super( model,
                kolor,
                predkosc,
                cena_za_dzien,
                licznik_przejechanych_kilometrow,
                silnik);
        this.liczba_miejsc = liczba_miejsc;

    }

    public int getLiczbaMiejsc(){
        return this.liczba_miejsc;
    }

    public void setLiczbaMiejsc(int liczba_miejsc){
        this.liczba_miejsc = liczba_miejsc;
    }

    @Override
    public String toString(){
        return "Samolot: " + super.toString() + "; Liczba Miejsc: " + liczba_miejsc;
    }

}
