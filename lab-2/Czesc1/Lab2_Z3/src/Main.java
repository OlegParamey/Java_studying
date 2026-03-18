void main() {
    // ── Authors ───────────────────────────────────────────────
    Author mickiewicz = new Author("Adam", "Mickiewicz", "Polish");
    Author melville = new Author("Herman", "Melville", "American");
    Author cormen = new Author("Thomas", "Cormen", "American");
    Author leiserson = new Author("Charles", "Leiserson", "American");
    Author szymborska = new Author("Wisława", "Szymborska", "Polish");
    Author garcia = new Author("Gabriel", "García Márquez", "Colombian");
    Author miller = new Author("Sarah", "Miller", "American");
    Author watson = new Author("James", "Watson", "British");
    Author chen = new Author("Emily", "Chen", "Chinese");

    // ── Books ─────────────────────────────────────────────────
    Book book1 = new Book("PWN", "001", "1834", 348);
    // Method .addAuthor that comes from Position class and can be used in each instances of this calss
    book1.addAuthor(mickiewicz);

    Book book2 = new Book("Penguin Classics", "002", "1851", 720);
    book2.addAuthor(melville);

    Book book3 = new Book("Oxford University Press", "003", "1999", 1292);
    book3.addAuthor(cormen);
    book3.addAuthor(leiserson);

    Book book4 = new Book("Znak", "004", "1996", 280);
    book4.addAuthor(szymborska);

    Book book5 = new Book("Vintage Books", "005", "1967", 417);
    book5.addAuthor(garcia);

    // ── Magazines ─────────────────────────────────────────────
    Magazine magazine1 = new Magazine("National Geographic", "006", "2023",
            "Exploration of deep ocean ecosystems and newly discovered species.", 512);
    magazine1.addAuthor(miller);

    Magazine magazine2 = new Magazine("Nature", "007", "2022",
            "Latest breakthroughs in gene editing and CRISPR technology.", 48);
    magazine2.addAuthor(watson);
    magazine2.addAuthor(chen);

    // ── Library ───────────────────────────────────────────────
    Library library = new Library("ul. Biblioteczna 5, 00-001 Warszawa");

    for (Position p : new Position[]{book1, book2, book3, book4, book5, magazine1, magazine2}) {
        library.addPosition(p);
    }

    System.out.println();
    System.out.println("1) Display address");
    // 1) Display address
    System.out.println(library.getAddress());

    System.out.println();
    System.out.println("2) Display all positions");
    // 2) Display all positions
    library.displayPositions();

    System.out.println();
    System.out.println("3) Search examples");
    // 3) Search examples
    Position foundById = library.findPosition("003", null, null);
    Position foundByAuthor = library.findPosition(null,  "Wisława", null);
    Position foundByYear = library.findPosition(null,  null, "2022");

    System.out.println("Position found by ID: " + foundById);
    System.out.println("Position found by author: " + foundByAuthor);
    System.out.println("Position found by year of publication: " + foundByYear);

    System.out.println();
    System.out.println("4) Remove and add position");
    // 4) Remove and add
    library.addPosition(foundById);

    library.removePosition(foundById);

}
