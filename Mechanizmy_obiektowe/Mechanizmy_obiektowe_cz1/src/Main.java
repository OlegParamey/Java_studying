void main() {

    // Product------------------------------------------------------------------------------------------------

    Produkt mleko = new Produkt(2.50, 2.03, "Mleko", "Mleko 3.2% 1L", 23);
    Produkt chleb = new Produkt(3.99, 3.25, "Chleb", "Chleb pszenny 500g", 8);
    Produkt maslo = new Produkt(6.49, 5.28, "Maslo", "Maslo 200g", 23);
    Produkt jajka = new Produkt(8.99, 7.31, "Jajka", "Jajka L 10szt", 23);
    Produkt ser = new Produkt(12.99, 10.56, "Ser", "Ser gouda 300g", 23);
    Produkt jogurt = new Produkt(3.49, 2.84, "Jogurt", "Jogurt naturalny 400g", 23);
    Produkt makaron = new Produkt(4.29, 3.49, "Makaron", "Makaron spaghetti 500g", 8);
    Produkt ryz = new Produkt(5.99, 4.87, "Ryz", "Ryz bialy 1kg", 8);
    Produkt kawa = new Produkt(18.99, 15.44, "Kawa", "Kawa mielona 250g", 23);
    Produkt herbata = new Produkt(9.49, 7.71, "Herbata", "Herbata czarna 100 torebek", 23);

    System.out.println("Product: ");
    herbata.wyswietl();
    System.out.println();

    // ------------------------------------------------------------------------------------------------------

    // Klienty i Adres------------------------------------------------------------------------------------------------
    Adres adres1 = new Adres("00-001", "Warszawa", "Marszalkowska", 15);
    Adres adres2 = new Adres("30-002", "Krakow", "Florianska", 42);
    Adres adres3 = new Adres("80-003", "Gdansk", "Dluga", 7);
    Adres adres4 = new Adres("60-004", "Poznan", "Swiety Marcin", 22);
    Adres adres5 = new Adres("50-005", "Wroclaw", "Swidnicka", 33);
    Adres adres6 = new Adres("40-006", "Katowice", "Staromiejska", 8);

    System.out.println("Adres6: ");
    System.out.println(adres6);
    System.out.println();

    Firma firma1 = new Firma(10, "TechSolutions Sp. z o.o.", 1234567890, adres1);
    Firma firma2 = new Firma(15, "BudMaster S.A.", 1876543210, adres2);
    Firma firma3 = new Firma(5, "FoodExpress Sp. z o.o.", 564738291, adres3);

    System.out.println("Firma1: ");
    firma1.wyswietl();
    System.out.println();

    OsobaFizyczna osoba1 = new OsobaFizyczna(5, "Jan", "Kowalski", adres4);
    OsobaFizyczna osoba2 = new OsobaFizyczna(10, "Anna", "Nowak", adres5);
    OsobaFizyczna osoba3 = new OsobaFizyczna(0, "Piotr", "Wisniewski", adres6);

    System.out.println("Osoba3: ");
    osoba3.wyswietl();
    System.out.println();
    // ------------------------------------------------------------------------------------------------------

    // Dostawy ------------------------------------------------------------------------------------------------

    OdbiorOsobisty odbior1 = new OdbiorOsobisty(LocalDate.of(2024, 12, 15));
    OdbiorOsobisty odbior2 = new OdbiorOsobisty(LocalDate.of(2024, 12, 20));
    OdbiorOsobisty odbior3 = new OdbiorOsobisty(LocalDate.now().plusDays(3));

    System.out.println("Odbior2: ");
    odbior2.wyswietl();
    System.out.println();

    Paczkomat paczkomat1 = new Paczkomat("WAW001");
    Paczkomat paczkomat2 = new Paczkomat("KRK042");
    Paczkomat paczkomat3 = new Paczkomat("GDA007");

    System.out.println("Paczkomat2: ");
    paczkomat2.wyswietl();
    System.out.println();

    PrzesylkaKurierska przesylka1 = new PrzesylkaKurierska(LocalDate.of(2024, 12, 16), "DHL", 0.0);
    PrzesylkaKurierska przesylka2 = new PrzesylkaKurierska(LocalDate.of(2024, 12, 18), "InPost", 150.99);
    PrzesylkaKurierska przesylka3 = new PrzesylkaKurierska(LocalDate.now().plusDays(2), "DPD", 89.50);

    System.out.println("Przesylka3: ");
    przesylka3.wyswietl();
    System.out.println();

    // ------------------------------------------------------------------------------------------------------

    // Zamowienie ------------------------------------------------------------------------------------------------

    Zamowienie zamowienie1 = new Zamowienie("Prosze zapakowac na prezent", 0, 1, mleko);
    zamowienie1.dodajProdukt(chleb);
    zamowienie1.dodajProdukt(herbata);

    zamowienie1.wyswietlSzczegoly();
    zamowienie1.usunProdukt(herbata);
    zamowienie1.zmienStatusZamowienia(2);
    System.out.println("zamowienie1 usuniecie herbaty i zmiana statusu: ");
    zamowienie1.wyswietlSzczegoly();
    System.out.println();

    zamowienie1.dodajProdukt(maslo);
    zamowienie1.ustawDaneKlienta(osoba1);
    zamowienie1.ustawMetodeDostawy(paczkomat1);
    zamowienie1.ustawAdresDostawy(adres1);

    Zamowienie zamowienie2 = new Zamowienie("", 0, 2, kawa);
    zamowienie2.dodajProdukt(herbata);
    zamowienie2.dodajProdukt(ser);
    zamowienie2.ustawDaneKlienta(firma1);
    zamowienie2.ustawMetodeDostawy(przesylka1);

    Zamowienie zamowienie3 = new Zamowienie("Dostawa pilna", 0, 3, jajka);
    zamowienie3.dodajProdukt(jogurt);
    zamowienie3.dodajProdukt(ryz);
    zamowienie3.ustawDaneKlienta(osoba2);
    zamowienie3.ustawMetodeDostawy(odbior1);

    zamowienie3.zrealizuj();

    // ------------------------------------------------------------------------------------------------------

    // Lista Zamowien ------------------------------------------------------------------------------------------------

    ListaZamowien listaZamowien = new ListaZamowien(zamowienie1);
    listaZamowien.dodajZamowienie(zamowienie2);
    listaZamowien.dodajZamowienie(zamowienie3);

    System.out.println("Wszyskie zamowenie");
    listaZamowien.wyswietlWszystkieZamowienia();
    System.out.println();

    System.out.println("Zrealizowane zamowenie");
    listaZamowien.wyswietlZrealizowaneZamowienia();
    System.out.println();

    System.out.println("Wyszukaj zamowenie po LocalDate");
    var date = LocalDate.now();
    listaZamowien.wyszukajZamowienia(date);

    System.out.println("Wyszukaj zamowenie po querry");
    var querry = "Dostawa pilna";
    listaZamowien.wyszukajZamowienia(querry);


    // ------------------------------------------------------------------------------------------------------
}
