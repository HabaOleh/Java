package Homework2.Task2;

public class Comics extends Book{
    private String genre;

    public Comics() {
    }

    public Comics(int year, String written, int countPage, String author, String genre) {
        super(year, written, countPage, author);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "genre='" + genre + '\'' +
                "} " + super.toString();
    }
}
