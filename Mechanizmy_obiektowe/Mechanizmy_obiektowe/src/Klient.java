public abstract class Klient {
    protected int rabat;
    protected Adres adres;

    public Klient(int rabat, Adres adres) {
        this.rabat = rabat;
        this.adres = adres;
    }

    public int getRabat() {
        return this.rabat;
    }


    public abstract void wyswietl();
}