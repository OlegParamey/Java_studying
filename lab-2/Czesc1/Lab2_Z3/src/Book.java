
//Klasa Ksiazka dziedziczy po klasie Pozycja.
//Dodatkowo zawiera ona pole strony, która
//przechowuje informacje na temat liczby stron.

public class Book extends Position {
    public int pages;
    Book(String publisher, String id, String year_of_publication, int pages){
        super(publisher, id, year_of_publication);
        this.pages = pages;
    }
}
