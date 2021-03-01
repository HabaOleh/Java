package Classwork2.Task1;

public class Magazine implements Printable{
    private int countPages;
    private String name;

    public Magazine() {
    }

    public Magazine(int countPages, String name) {
        this.countPages = countPages;
        this.name = name;
    }

    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        this.countPages = countPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Magazine "+name);
    }

    public static void printMagazines(Printable[] printable){
        for(Printable one:printable){
            if(one instanceof Magazine){
                System.out.println("Magazine: " + ((Magazine) one).getName());
            }
        }
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "countPages=" + countPages +
                ", name='" + name + '\'' +
                '}';
    }
}
