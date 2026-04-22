public class Produkt {

    private double cenaBrutto, cenaNetto;
    private String nazwa, opis;
    private int podatek;

    public Produkt(double cenaBrutto, double cenaNetto, String nazwa, String opis, int podatek){
        this.cenaBrutto = cenaBrutto;
        this.cenaNetto = cenaNetto;
        this.nazwa = nazwa;
        this.opis = opis;
        this.podatek = podatek;
    }

    public void wyswietl(){
        System.out.println("Product " + this.nazwa + " - ("
                + this.opis +"), cena Brutto/Netto: "
                + this.cenaBrutto + "/" + this.cenaNetto
                +" podatek " + this.podatek);
    }

    public double getCenaNetto(){
        return this.cenaNetto;
    }

    public double getCenaBrutto(){
        return this.cenaBrutto;
    }

    public String getName(){
        return this.nazwa;
    }

}
