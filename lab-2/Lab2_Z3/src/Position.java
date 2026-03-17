//Klasa Pozycja reprezentuje pozycje w bibliotece.
//Pozycja powinna przechowywać informacje takie
//jak: lista autorów, id, wydawnictwo, rok wydania.
//Klasa powinna także posiadać metodę umożliwiającą dodanie autora.

import java.util.ArrayList;
import java.util.Objects;

public class Position  {
    private String publisher, id, year_of_publication;
    private ArrayList<Author> list_of_authors;

    Position(String publisher, String id, String year_of_publication){
        this.publisher = publisher;
        this.id = id;
        this.year_of_publication = year_of_publication;
        this.list_of_authors = new ArrayList<Author>();
    }

    public void addAuthor(Author new_author){
        this.list_of_authors.add(new_author);
    }

    public String getPublisher(){
        return this.publisher;
    }

    public String getId(){
        return this.id;
    }

    public ArrayList<Author> getAuthors (){
        return this.list_of_authors;
    }

    public String getYear(){
        return this.year_of_publication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;
        Position other = (Position) o;
        return Objects.equals(id, other.id);
    }

    @Override
    public String toString() {
        return "Position{id='" + id + "', publisher='" + publisher +
                "', year='" + year_of_publication + "', authors=" + list_of_authors + "}";
    }
}
