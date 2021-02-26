package Homework2.Task2;

public class Main {
    public static void main(String[] args) {
        Papyrus papyrus = new Papyrus(1245,"handwrite");
        Book book = new Book(1840,"handwrite",356,"Shevchenko");
        Comics comics = new Comics(2010,"machineWrite",55,"Scott Snyder","fantastic");
        Magazine magazine = new Magazine(2020,"machineWrite",60,"Bert Forbes",120,"Forbes");

        System.out.println(papyrus);
        System.out.println(book);
        System.out.println(comics);
        System.out.println(magazine);
    }
}
