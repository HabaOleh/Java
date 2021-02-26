package Homework2.Task2;

public class Book extends Papyrus{
    private int countPage;
    private String author;

    public Book() {
    }

    public Book(int year, String written, int countPage, String author) {
        super(year, written);
        this.countPage = countPage;
        this.author = author;
    }

    public int getCountPage() {
        return countPage;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "countPage=" + countPage +
                ", author='" + author + '\'' +
                "} " + super.toString();
    }
}
