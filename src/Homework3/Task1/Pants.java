package Homework3.Task1;

public class Pants extends Clothes implements MenClothes,WomanClothes{

    public Pants() {
    }

    public Pants(Sizes size, double price, String color, String name) {
        super(size, price, color, name);
    }

    @Override
    public void dressMen() {
        System.out.println("Men dress in pants");
    }

    @Override
    public void dressWomen() {
        System.out.println("Woman dress in pants");
    }

}
