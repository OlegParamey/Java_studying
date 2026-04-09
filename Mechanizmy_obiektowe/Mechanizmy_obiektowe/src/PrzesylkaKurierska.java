import java.time.LocalDate;

public class PrzesylkaKurierska extends Dostawa {
    private LocalDate dataWysylki;
    private String firmaKurierska;
    private double kwotaPobrania;

    public PrzesylkaKurierska(LocalDate dataWysylki, String firmaKurierska, double kwotaPobrania){
        this.dataWysylki = dataWysylki;
        this.firmaKurierska = firmaKurierska;
        this.kwotaPobrania = kwotaPobrania;

    }

    @Override
    public void wyswietl(){
        System.out.println("Przesylka kurierska przez " + firmaKurierska + ", kwota pobrania: " + kwotaPobrania + ", data wysylki: " + dataWysylki);
    };
}
