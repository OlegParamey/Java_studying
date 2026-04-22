import java.time.LocalDate;

public class OdbiorOsobisty extends Dostawa {

    private LocalDate przewidywanaDataOdbioru;

    public OdbiorOsobisty(LocalDate przewidywanaDataOdbioru) {
        this.przewidywanaDataOdbioru = przewidywanaDataOdbioru;
    }

    @Override
    public void wyswietl(){
        System.out.println("Odbior osobisty: " + przewidywanaDataOdbioru );
    };

}
