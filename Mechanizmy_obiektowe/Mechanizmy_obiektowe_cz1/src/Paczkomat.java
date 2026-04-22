public class Paczkomat extends Dostawa {

    private String kodPaczkomatu;

    public Paczkomat(String kodPaczkomatu){
        this.kodPaczkomatu = kodPaczkomatu;
    }

    @Override
    public void wyswietl(){
        System.out.println("Paczkomat: " + kodPaczkomatu);
    };
}
