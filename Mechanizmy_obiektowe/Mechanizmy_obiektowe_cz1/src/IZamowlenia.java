import java.time.LocalDate;

public interface IZamowlenia {

   void wyswietlWszystkieZamowienia();

    void wyswietlZrealizowaneZamowienia();

    void wyszukajZamowienia(LocalDate date);

    void wyszukajZamowienia(String querry);


}
