package Classwork2.Task2;

public class Baraban implements Instrument {
    private double rozmir;

    public Baraban() {
    }

    public Baraban(double rozmir) {
        this.rozmir = rozmir;
    }

    public double getRozmir() {
        return rozmir;
    }

    public void setRozmir(double rozmir) {
        this.rozmir = rozmir;
    }

    @Override
    public void play() {
        System.out.println("Baraban rozmirom "+rozmir+ "cm play");
    }

    @Override
    public String toString() {
        return "Baraban{" +
                "rozmir=" + rozmir +
                '}';
    }
}
