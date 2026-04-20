package Transport;

import Transport.Engines.Silnik;

public class Motocykl extends Pojazd{
    private String VIN, numer_rejestracyjny, typ;


    public Motocykl(String model,
                    int predkosc,
                    String kolor,
                    String VIN,
                    String numer_rejestracyjny,
                    int licznik_przejechanych_kilometrow,
                    int cena_za_dzien, String typ,
                    Silnik silnik){
        super(model, kolor, predkosc,  licznik_przejechanych_kilometrow, cena_za_dzien, silnik);
        this.VIN = VIN;
        this.numer_rejestracyjny = numer_rejestracyjny;
        this.typ = typ;
    }

    @Override
    public String toString(){
        return "Motocykl " + super.toString() + ", VIN: " + this.VIN + ", numer rejestracyjny: " + this.numer_rejestracyjny + ", typ: " + this.typ;
    }
}
