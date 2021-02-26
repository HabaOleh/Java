package Homework2.Task1;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal",2);

        Wild tiger = new Wild("Wild",4,true,"Tiger");
        Homemade chicken = new Homemade("Homemade",3,"Chicken",30);

        Wolf wolf = new Wolf("Wild",5,false,"Wolf",true);
        Bear bear = new Bear("Wild",2,true,"Bear",true);
        Dog dog = new Dog("Homemade",1,"dog",1,"house");
        Cat cat = new Cat("Homemade",4,"cat",1,"may-may");

        Animal arrOfAnimal[] = new Animal[7];
        arrOfAnimal[0]=animal;
        arrOfAnimal[1]=tiger;
        arrOfAnimal[2]=chicken;
        arrOfAnimal[3]=wolf;
        arrOfAnimal[4]=bear;
        arrOfAnimal[5]=dog;
        arrOfAnimal[6]=cat;

        Wild arrOfWild[]= new Wild[3];
        arrOfWild[0]=tiger;
        arrOfWild[1]=wolf;
        arrOfWild[2]=bear;

        Homemade arrOfHomemade[] = new Homemade[3];
        arrOfHomemade[0]=chicken;
        arrOfHomemade[1]=dog;
        arrOfHomemade[2]=cat;

    }
}
