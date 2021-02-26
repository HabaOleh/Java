package Homework2.Task1;

public class Homemade extends Animal{
    private String species;
    private int count;

    public Homemade() {
    }

    public Homemade(String type, int age, String species, int count) {
        super(type, age);
        this.species = species;
        this.count = count;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Homemade{" +
                "species='" + species + '\'' +
                ", count=" + count +
                "} " + super.toString();
    }
}
