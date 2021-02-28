package Homework3.Task1;

public class Main {
    public static void main(String[] args) {

        T_shirt tShirt = new T_shirt(Sizes.M,250,"green","t-shirt");
        tShirt.dressMen();
        Dress dress1 = new Dress(Sizes.L,4500,"Pink","dress");
        dress1.dressWomen();

        Clothes pants = new Pants(Sizes.L,980,"black","pants");
        Clothes tie = new Tie(Sizes.S,120,"red","tie" );
        Clothes t_shirt = new T_shirt(Sizes.M,580,"white","t-shirt");
        Clothes dress = new Dress(Sizes.XS,1500,"blue","dress");

        Clothes[] clothes = new Clothes[4];
        clothes[0]=pants;
        clothes[1]=tie;
        clothes[2]=t_shirt;
        clothes[3]=dress1;

        Atelier atelier = new Atelier(clothes);

        atelier.getManClothes();
        atelier.getWomanClothes();


    }
}
