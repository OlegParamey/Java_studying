public class Firma extends Klient {
    private String nazwaFirmy;
    private int NIP;

    public Firma(int rabat, String nazwaFirmy, int NIP, Adres adres) {
        super(rabat, adres);
        this.nazwaFirmy = nazwaFirmy;
        this.NIP = NIP;
    }

    @Override
    public void wyswietl() {
        System.out.println("Firma: " + nazwaFirmy + ", NIP: " + NIP + ", rabat: " + rabat + ", adres: " + adres);
    }
}