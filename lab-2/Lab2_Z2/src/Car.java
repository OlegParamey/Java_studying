public class Car {

     String marka, model, moc, pojemnosc, rok_produkcji;

    public Car (String marka, String model, String moc, String pojemnosc, String rok_produkcji){
        this.marka = marka;
        this.model = model;
        this.moc = moc;
        this.pojemnosc = pojemnosc;
        this.rok_produkcji = rok_produkcji;
    }

    public String getData (){
        String carsData = "Marka: " + marka + "\nModel: " + model + "\nMoc: " +
                moc + " KM" + "\nPojemnosc: " + pojemnosc + " L" + "\nRok produkcji: " + rok_produkcji;
        return carsData;
    }

    public String getMarka(){
        return this.marka;
    }

    public String getCarName(){
        return this.marka + " " + this.model;
    }

}
