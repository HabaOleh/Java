package Classwork2.Task2;

public class Gitara implements Instrument{
    private int countStrun;

    public Gitara() {
    }

    public Gitara(int countStrun) {
        this.countStrun = countStrun;
    }

    public int getCountStrun() {
        return countStrun;
    }

    public void setCountStrun(int countStrun) {
        this.countStrun = countStrun;
    }

    @Override
    public void play() {
        System.out.println("Gitara have "+countStrun+" strun play");
    }

    @Override
    public String toString() {
        return "Gitara{" +
                "countStrun=" + countStrun +
                '}';
    }
}
