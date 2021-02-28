package Homework3.Task1;

import java.util.Arrays;

public class Atelier {
    private Clothes[] clothes;

    public Atelier() {
    }

    public Atelier(Clothes[] clothes) {
        this.clothes = clothes;
    }

    public Clothes[] getClothes() {
        return clothes;
    }

    public void setClothes(Clothes[] clothes) {
        this.clothes = clothes;
    }

    public void getManClothes() {
        for(Clothes manClothes:clothes){
            if(manClothes instanceof MenClothes){
                System.out.println("Man clothes: "+manClothes);
            }
        }
    }

    public void getWomanClothes() {
        for(Clothes womanClothes:clothes){
            if(womanClothes instanceof WomanClothes){
                System.out.println("Woman clothes: "+womanClothes);
            }
        }
    }

    @Override
    public String toString() {
        return "Atelier{" +
                "clothes=" + Arrays.toString(clothes) +
                '}';
    }
}
