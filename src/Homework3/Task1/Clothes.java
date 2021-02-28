package Homework3.Task1;

public abstract class Clothes {
   private Sizes size;
   private double price;
   private String color;
   private String name;

    public Clothes() {
    }

    public Clothes(Sizes size, double price, String color, String name) {
        this.size = size;
        this.price = price;
        this.color = color;
        this.name = name;
    }

    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

