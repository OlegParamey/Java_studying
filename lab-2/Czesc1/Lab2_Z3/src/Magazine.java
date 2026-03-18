
//Klasa Czasopismo dziedziczy po klasie Pozycja.
//Dodatkowo zawiera ona pola streszczenie oraz numer,
//przechowujące krótkie streszczenie czasopisma oraz jego numer.

public class Magazine extends Position {
    public String summary;
    public int issue_number;

    Magazine(String publisher, String id, String year_of_publication, String summary, int issue_number) {
        super(publisher, id, year_of_publication);
        this.summary = summary;
        this.issue_number = issue_number;
    }

}
