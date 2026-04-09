public class Adres {
    private String kodPocztowy, miasto, ulica;
    private int numer;

    public Adres(String kodPocztowy, String miasto, String ulica, int numer){
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
        this.ulica = ulica;
        this.numer = numer;

    }

    public String getMiasto(){
        return this.miasto;
    }

    public String getUlica(){
        return this.ulica;
    }

    public String getKodPocztowy(){
        return this.kodPocztowy;
    }

    public int getNumer() {
        return this.numer;
    }

    @Override
    public String toString() {
        return ulica + " " + numer + ", " + miasto + " (" + kodPocztowy + ")";
    }
}
