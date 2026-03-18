//Klasa Biblioteka przechowuje listę obiektów klasy
// Pozycja oraz adres. Dodatkowo posiada ona metody umożliwiające:

// 1) wyświetlenie adresu;
// 2) wyświetlenie informacji o wszystkich pozycjach;
// 3) wyszukiwanie po id, autorze, tytule oraz roku wydania;
// 4) odawanie oraz usuwanie pozycji.

import java.util.ArrayList;

public class Library {
    public ArrayList<Position> positions;
    public String address;

    Library(String address) {
        this.address = address;
        this.positions = new ArrayList<Position>();
    }

    public String getAddress(){
        return this.address;
    }

    public void displayPositions(){
        System.out.println(positions);
    }

    public Position findPosition(String id, String author_name, String year_of_publication) {
        for (Position pos : positions) {
            boolean idMatch = pos.getId().equals(id);
            boolean yearMatch = pos.getYear().equals(year_of_publication);

            boolean authorMatch = false;
            for (Author a : pos.getAuthors()) {
                if (a.getName().equals(author_name)) {
                    authorMatch = true;
                    break;
                }
            }

            if (idMatch || authorMatch || yearMatch) {
                return pos;
            }
        }
        return null;
    }

    public void addPosition(Position new_position){
        this.positions.add(new_position);
        System.out.println(new_position + " has been added");
    }

    public void removePosition(Position position){
        this.positions.remove(position);
        System.out.println(position + " has been removed");
    }
}
