package Classwork2.Task1;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Kobzar","Shevchenko",120);
        Book book2 = new Book("Virshi","Lesia Ukrainka",90);
        Book book3 = new Book("Kolyskovi","Narodni",150);
        Magazine magazine1 = new Magazine(60,"Forbes");
        Magazine magazine2 = new Magazine(50,"Gardens");
        Printable[] arr = new Printable[5];
        arr[0]=book1;
        arr[1]=book2;
        arr[2]=book3;
        arr[3]=magazine1;
        arr[4]=magazine2;
        for (Printable one:arr){
            one.print();
        }
        System.out.println("Books:");
        Book.printBook(arr);
        System.out.println("Magazines:");
        Magazine.printMagazines(arr);
    }
}
