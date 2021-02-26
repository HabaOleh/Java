package Homework2.Task1;

public class Dog extends Homemade{
    private String live;

    public Dog() {
    }

    public Dog(String type, int age, String species, int count, String live) {
        super(type, age, species, count);
        this.live = live;
    }

    public String getLive() {
        return live;
    }

    public void setLive(String live) {
        this.live = live;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "live='" + live + '\'' +
                "} " + super.toString();
    }
}
