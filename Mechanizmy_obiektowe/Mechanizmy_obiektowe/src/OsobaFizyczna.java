public class OsobaFizyczna extends Klient {
    private String imie;
    private String nazwisko;

    public OsobaFizyczna(int rabat, String imie, String nazwisko, Adres adres) {
        super(rabat, adres);
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public void wyswietl() {
        System.out.println("Osoba fizyczna: " + imie + " " + nazwisko + ", rabat: " + rabat + ", adres: " + adres);
    }
}