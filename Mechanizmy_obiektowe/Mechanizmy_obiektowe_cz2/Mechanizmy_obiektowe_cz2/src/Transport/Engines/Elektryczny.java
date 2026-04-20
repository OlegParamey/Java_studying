package Transport.Engines;

public class Elektryczny extends Silnik {
    private int zuzycie_baterii_na_kilometr, stan_naladowania_baterii;

    public Elektryczny(int zuzycie_baterii_na_kilometr, int stan_naladowania_baterii){
        this.zuzycie_baterii_na_kilometr = zuzycie_baterii_na_kilometr;
        this.stan_naladowania_baterii = stan_naladowania_baterii;
    }

    @Override
    public void work(int km){
        this.stan_naladowania_baterii = Math.max((stan_naladowania_baterii - km * zuzycie_baterii_na_kilometr), 0);
        if (this.stan_naladowania_baterii == 0) System.out.println("Silnik rozladowany!");

    }

    @Override
    public void laduj(int liczba) {
        this.stan_naladowania_baterii = Math.min((stan_naladowania_baterii+liczba), 100);
    }

    @Override
    public String toString(){
        return super.toString() + " Elektryczny" + ", zuzycie baterii na kilometr: " + this.zuzycie_baterii_na_kilometr + ", zaladowany na: " + this.stan_naladowania_baterii;
    }
}
