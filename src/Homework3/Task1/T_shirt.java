package Homework3.Task1;

public class T_shirt extends Clothes implements MenClothes,WomanClothes{
    public T_shirt() {
    }

    public T_shirt(Sizes size, double price, String color, String name) {
        super(size, price, color, name);
    }

    @Override
    public void dressMen() {
        System.out.println("Men dress in t-shirt "+this.getSize());
    }

    @Override
    public void dressWomen() {
        System.out.println("Woman dress in t-shirt "+this.getSize());
    }
}
