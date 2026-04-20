import Transport.*;
import Transport.Cars.Dostawczy;
import Transport.Cars.Samochod;
import Transport.Engines.*;

void main() {

    Elektryczny silnik1 = new Elektryczny(5, 100);
    Elektryczny silnik2 = new Elektryczny(3, 75);
    Elektryczny silnik3 = new Elektryczny(10, 50);

    silnik1.work(10);
    silnik1.laduj(30);

    silnik2.work(30);
    silnik2.laduj(100);

    System.out.println(silnik1);

    Spalinowy silnik4 = new Spalinowy(2000, 150, 8, 60, "Benzyna");
    Spalinowy silnik5 = new Spalinowy(1600, 115, 6, 45, "Diesel");
    Spalinowy silnik6 = new Spalinowy(3000, 250, 12, 80, "LPG");

    silnik4.work(5);
    silnik4.work(5);
    silnik4.laduj(40);

    System.out.println(silnik4);


    Elektryczny silnikE = new Elektryczny(5, 100);
    Spalinowy  silnikS  = new Spalinowy(2000, 150, 8, 60, "Benzyna");


    Samochod tesla   = new Samochod("Tesla Model 3", "Czarny",  250, 4, "1HGBH41JXMN109186", "KR 12345", 0,     200, silnikE);
    Samochod toyota  = new Samochod("Toyota Corolla","Biały",   180, 4, "2T1BURHE0JC025512", "WA 67890", 15000, 150, silnikS);
    Samochod fiat    = new Samochod("Fiat 500",      "Czerwony",150, 2, "ZFA3120000J123456", "CZ 11111", 30000, 100,
            new Spalinowy(1200, 70, 5, 40, "Benzyna"));

    tesla.jedz(10);
    tesla.jedz(10);
    tesla.tankuj(80);

    toyota.jedz(5);
    toyota.zwiekszPredkosc(20);

    System.out.println(tesla.getSilnikStatus());
    System.out.println(toyota);
    System.out.println(fiat.getCenaZaDzien());


    Elektryczny silnikE_samolot = new Elektryczny(3, 100);
    Spalinowy   silnikS_samolot = new Spalinowy(8000, 3000, 20, 500, "Nafta");

    Samolot samolot1 = new Samolot("Boeing 737",   900, "Biały",  500000, 50000, silnikS_samolot,  180);
    Samolot samolot2 = new Samolot("Airbus A320",  850, "Szary",  320000, 45000,
            new Spalinowy(10000, 2500, 15, 800, "Nafta"), 150);
    Samolot samolot3 = new Samolot("Solar Impulse", 140, "Żółty",  10000,  20000, silnikE_samolot,  1);

    samolot1.jedz(1500);
    samolot1.tankuj(300);

    samolot2.zwiekszPredkosc(50);
    samolot2.setLiczbaMiejsc(160);

    System.out.println(samolot1.getLiczbaMiejsc());
    System.out.println(samolot1.getSilnikStatus());
    System.out.println(samolot2);


    // 1. Создаём двигатели
    Spalinowy silnikS_dostawczy = new Spalinowy(2200, 140, 10, 80, "Diesel");
    Elektryczny silnikE_dostawczy = new Elektryczny(8, 90);

    Dostawczy van1 = new Dostawczy(4, "Mercedes Sprinter", 160, "Biały",  "WDB9066351S123456", "WA 11111", 80000,  300, 1500, silnikS_dostawczy);
    Dostawczy van2 = new Dostawczy(4, "Volkswagen Crafter", 150, "Szary", "WV1ZZZ2EZ31234567", "KR 22222", 50000,  250, 2000,
            new Spalinowy(1900, 120, 9, 70, "Diesel"));
    Dostawczy van3 = new Dostawczy(2, "Nissan e-NV200",    120, "Czarny","SJNFAAZE0U6123456", "GD 33333", 10000,  350, 800, silnikE_dostawczy);

    van1.jedz(50);
    van1.tankuj(60);

    van2.zwiekszPredkosc(30);
    van2.setLiczbaDrzwi(3);

    System.out.println(van1.getSilnikStatus());
    System.out.println(van2);

    Spalinowy silnikS_moto = new Spalinowy(1000, 90, 5, 20, "Benzyna");
    Elektryczny silnikE_moto = new Elektryczny(4, 100);

    Motocykl moto1 = new Motocykl("Harley-Davidson",  180, "Czarny", "1HD1KHH19KB123456", "KR 55555", 20000, 200, "Chopper",  silnikS_moto);
    Motocykl moto2 = new Motocykl("Yamaha R1",        299, "Niebieski","JYARN22E12A123456","WA 66666", 15000, 250, "Sportowy", new Spalinowy(1000, 200, 7, 18, "Benzyna"));
    Motocykl moto3 = new Motocykl("Zero SR/F",        200, "Czerwony", "538SD9Z44LCG12345","GD 77777", 5000,  300, "Elektryczny", silnikE_moto);


    moto1.jedz(3);
    moto1.jedz(2);
    moto1.tankuj(15);

    moto3.jedz(20);
    moto3.zwiekszPredkosc(20);

    System.out.println(moto1.getSilnikStatus());
    System.out.println(moto2);

}
