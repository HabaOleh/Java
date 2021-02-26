package Homework2.Task2;

public class Magazine extends Book {
    private double cost;
    private String name;

    public Magazine() {
    }

    public Magazine(int year, String written, int countPage, String author, double cost, String name) {
        super(year, written, countPage, author);
        this.cost = cost;
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }
}
