import java.time.LocalDate;
import java.util.ArrayList;

public class ListaZamowien implements IZamowlenia{

    private ArrayList<Zamowienie> listaZamowien;

    public ListaZamowien(Zamowienie zamowienie){
    this.listaZamowien = new ArrayList<>();
    this.listaZamowien.add(zamowienie);
    }

    public ListaZamowien(){
        this.listaZamowien = new ArrayList<>();
    }

    public void dodajZamowienie(Zamowienie zamowienie) {
        this.listaZamowien.add(zamowienie);
    }

    @Override
    public void wyswietlWszystkieZamowienia() {
        var i = 1;
        for (Zamowienie z : listaZamowien){
            z.wyswietlSzczegoly();
            i += 1;
        }

    }

    @Override
    public void wyswietlZrealizowaneZamowienia() {
        var i = 1;
        for (Zamowienie z : listaZamowien){
            if(z.getStatus().equals("zrealizowane")){
            z.wyswietlSzczegoly();
            }
            i += 1;
        }
    }

    @Override
    public void wyszukajZamowienia(LocalDate date) {
        for (Zamowienie z : this.listaZamowien) {
            if (z.getDataUtworzenia().equals(date)) {
                z.wyswietlSzczegoly();
            }
        }
    }

    @Override
    public void wyszukajZamowienia(String querry) {
        for (Zamowienie z : this.listaZamowien) {
            if (z.getInformacjeDodatkowe().toLowerCase().contains(querry.toLowerCase())) {
                z.wyswietlSzczegoly();
            }
        }
    }
}
