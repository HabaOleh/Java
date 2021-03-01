package Classwork2.Task1;

public class Book implements Printable{
    private String name;
    private String author;
    private int price;

    public Book() {
    }

    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("Book "+ name);
    }
    public static void printBook(Printable[] printable){
        for(Printable one:printable){
            if(one instanceof Book){
                System.out.println("Book: " + ((Book) one).getName());
            }
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
