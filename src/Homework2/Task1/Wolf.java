package Homework2.Task1;

public class Wolf extends Wild{
    private boolean isHungry;

    public Wolf() {
    }

    public Wolf(String type, int age, boolean isAloneHunter, String species, boolean isHungry) {
        super(type, age, isAloneHunter, species);
        this.isHungry = isHungry;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "isHungry=" + isHungry +
                "} " + super.toString();
    }
}
