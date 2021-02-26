package Homework2.Task1;

public class Wild extends Animal {
    private boolean isAloneHunter;
    private String species;

    public Wild() {
    }

    public Wild(String type, int age, boolean isAloneHunter, String species) {
        super(type, age);
        this.isAloneHunter = isAloneHunter;
        this.species = species;
    }

    public boolean isAloneHunter() {
        return isAloneHunter;
    }

    public void setAloneHunter(boolean aloneHunter) {
        isAloneHunter = aloneHunter;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Wild{" +
                "isAloneHunter=" + isAloneHunter +
                ", species='" + species + '\'' +
                "} " + super.toString();
    }
}
