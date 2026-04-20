package Transport.Engines;

public class Spalinowy extends Silnik  {
    private String rodzaj_paliwa;
    private int pojemnosc, moc, spalanie_na_kilometr, ilosc_dostępnego_paliwa;

    public Spalinowy(int pojemnosc, int moc, int spalanie_na_kilometr, int ilosc_dostępnego_paliwa, String rodzaj_paliwa){
        this.pojemnosc = pojemnosc;
        this.moc = moc;
        this.spalanie_na_kilometr = spalanie_na_kilometr;
        this.ilosc_dostępnego_paliwa = ilosc_dostępnego_paliwa;
        this.rodzaj_paliwa = rodzaj_paliwa;
    }

    @Override
    public void work(int km){
        this.ilosc_dostępnego_paliwa = Math.max((ilosc_dostępnego_paliwa - km * spalanie_na_kilometr), 0);
        if (this.ilosc_dostępnego_paliwa == 0) System.out.println("Zbiornik paliwa jest pusty!");
    }

    @Override
    public void laduj(int liczba) {
        this.pojemnosc = Math.min((pojemnosc+liczba), 100);
    }

    @Override
    public String toString(){
        return super.toString() + " Spalinowy" + "moc: " + this.moc  + ", spalanie na kilometr: " + this.spalanie_na_kilometr + ", ilosc dostępnego paliwa: " + this.ilosc_dostępnego_paliwa + ", rodzaj paliwa: " + this.rodzaj_paliwa;
    }
}
