package Homework3.Task1;

public class Dress extends Clothes implements WomanClothes{
    public Dress() {
    }

    public Dress(Sizes size, double price, String color, String name) {
        super(size, price, color, name);
    }

    @Override
    public void dressWomen() {
        System.out.println("Woman dress in "+this.getColor()+" dress size "+this.getSize());

    }
}
