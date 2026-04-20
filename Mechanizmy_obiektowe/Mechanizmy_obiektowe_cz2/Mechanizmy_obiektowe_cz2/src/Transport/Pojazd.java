package Transport;
import Transport.Cars.ITuning;
import Transport.Engines.*;

public abstract class Pojazd implements ITuning {
    private Silnik silnik;
    private String model, kolor;
    private int predkosc, licznik_przejechanych_kilometrow, cena_za_dzien;

    public Pojazd(String model, String kolor, int predkosc, int cena_za_dzien, int licznik_przejechanych_kilometrow, Silnik silnik){
        this.model = model;
        this.predkosc = predkosc;
        this.licznik_przejechanych_kilometrow = licznik_przejechanych_kilometrow;
        this.cena_za_dzien = cena_za_dzien;
        this.kolor = kolor;
        this.silnik = silnik;
    }

    public String getModel(){
        return this.model;
    }

    public int getPredkosc(){
        return this.predkosc;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setPredkosc(int predkosc){
        this.predkosc = predkosc;
    }

    public int getCenaZaDzien(){
        return this.cena_za_dzien;
    }

    private void increaseLicznikPrzejechanychKilometrow(int przejechane_kilometry){
        this.licznik_przejechanych_kilometrow += przejechane_kilometry;
    }

    public void jedz(int ilosc_kilometrow){
        increaseLicznikPrzejechanychKilometrow(ilosc_kilometrow);
        silnik.work(ilosc_kilometrow);

    }
    public void tankuj(int procent){
        this.silnik.laduj(procent);
    }

    public String getSilnikStatus(){
        return this.silnik.toString();
    }

    public String toString(){
        return "Model = " + model + " , kolor: "
                + this.kolor +  "; Predkosc = " + predkosc
                + ", cena za dzien(PLN): " + this.cena_za_dzien
                + ", liczba przejechanych kilometrow: " + this.licznik_przejechanych_kilometrow;
    }

    public void zwiekszPredkosc(int predkosc){
        this.setPredkosc(this.getPredkosc() + predkosc);
    }

}
