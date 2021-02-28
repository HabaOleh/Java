package Homework3.Task1;

public class Tie extends Clothes implements MenClothes{
    public Tie() {
    }

    public Tie(Sizes size, double price, String color, String name) {
        super(size, price, color, name);
    }

    @Override
    public void dressMen() {
        System.out.println("Men dress in tie");

    }
}
