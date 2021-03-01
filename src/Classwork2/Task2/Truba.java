package Classwork2.Task2;

public class Truba implements Instrument{
    private double dim;

    public Truba() {
    }

    public Truba(double dim) {
        this.dim = dim;
    }

    public double getDim() {
        return dim;
    }

    public void setDim(double dim) {
        this.dim = dim;
    }

    @Override
    public void play() {
        System.out.println("Truba diametr = "+dim +" play");
    }

    @Override
    public String toString() {
        return "Truba{" +
                "dim=" + dim +
                '}';
    }
}
