import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Zamowienie {

    private int numerZamowenia;
    private LocalDate dataUtworzenia;
    private String informacjeDodatkowe;
    private int status;
    private double wartoscBrutto=0, wartoscNetto=0;
    private ArrayList<Produkt> listaProduktow;

    private Dostawa metodaDostawy;
    private Klient klient;
    private Adres adresDostawy = null;

    public Zamowienie( String informacjeDodatkowe, int status, int numerZamowenia, Produkt produkt){
        this.dataUtworzenia = LocalDate.now();
        if(informacjeDodatkowe == null || informacjeDodatkowe.isEmpty()){
            this.informacjeDodatkowe = "";
        } else {
            this.informacjeDodatkowe = informacjeDodatkowe;
        }
        this.status = status;
        this.listaProduktow = new ArrayList<Produkt>();
        this.listaProduktow.add(produkt);
        this.numerZamowenia = numerZamowenia;
        obliczWartosc();
    }

    public void dodajProdukt(Produkt product){
        this.listaProduktow.add(product);
        obliczWartosc();
    };

    public void ustawAdresDostawy(Adres address){
        this.adresDostawy = address;
    };

    public LocalDate getDataUtworzenia() {
        return this.dataUtworzenia;
    }

    public String getInformacjeDodatkowe() {
        return this.informacjeDodatkowe;
    }

    public void obliczWartosc() {
        this.wartoscNetto = 0;
        this.wartoscBrutto = 0;
        for (Produkt p : this.listaProduktow) {
            this.wartoscNetto += p.getCenaNetto();
            this.wartoscBrutto += p.getCenaBrutto();
        }
        if (this.klient != null) {
            double rabat = 1 - (this.klient.getRabat() / 100.0);
            this.wartoscNetto = this.wartoscNetto * rabat;
            this.wartoscBrutto = this.wartoscBrutto * rabat;
        }
        this.wartoscNetto = wartoscNetto = Math.round(wartoscNetto * 1000.0) / 1000.0;
        this.wartoscBrutto = wartoscBrutto = Math.round(wartoscBrutto * 1000.0) / 1000.0;
    }


    public void ustawDaneKlienta(Klient new_klient){
        this.klient = new_klient;
        obliczWartosc();
    };

    public void ustawMetodeDostawy(Dostawa new_metode_dostawy){
        this.metodaDostawy = new_metode_dostawy;
    };

    public void usunProdukt(Produkt product){
        this.listaProduktow.remove(product);
        obliczWartosc();
    };

    public void wyswietlStatus(){
        System.out.println("Status zamowienia: " + this.getStatus());
    };

    private String getProdutStringFromList(List<Produkt> array) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.size(); i++) {
            if (i == array.size() - 1) {
                result.append(array.get(i).getName());
            } else {
                result.append(array.get(i).getName()).append(", ");
            }
        }
        return result.toString();
    }

    public void wyswietlSzczegoly(){
        var adresText = "";
        if(adresDostawy != null){
            adresText = ", adres dostawy: " + adresDostawy;
        }
        System.out.println("Szczegoly: zamowienie numer " + this.numerZamowenia + ", utworzone " + this.dataUtworzenia + "; Status: jest " + this.getStatus()
        + ", dodane produkty: " + getProdutStringFromList(this.listaProduktow)
        + ", wartosc Brutto/Netto: " + this.wartoscBrutto + "/" + this.wartoscNetto
        + ", informacja dodatkowa: " + this.informacjeDodatkowe + adresText);
    };

    public void zmienStatusZamowienia(int new_status){
        this.status = new_status;
    }

    public void zrealizuj(){
        // realizacja zamowienia
        this.status = 1;
    }

    protected String getStatus(){
        switch (this.status){
            case 0:
                return "w trakcie";
            case 1:
                return "zrealizowane";
            case 2:
                return "skasowane";
        }
        return "niewiadomy";
    }

}

