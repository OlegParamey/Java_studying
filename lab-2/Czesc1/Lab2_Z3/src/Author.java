//Klasa Autor przechowuje informacje na temat autora: imię, nazwisko oraz narodowość.

public class Author {
    private String name, surname, citizenship;

    public Author (String name, String surname, String citizenship){
        this.name = name;
        this.surname = surname;
        this.citizenship = citizenship;
    }

    public String getName(){
        return this.name;
    }

}
