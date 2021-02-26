package Homework2.Task2;

public class Papyrus {
 private int year;
 private String written;

    public Papyrus() {
    }

    public Papyrus(int year, String written) {
        this.year = year;
        this.written = written;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getWritten() {
        return written;
    }

    public void setWritten(String written) {
        this.written = written;
    }

    @Override
    public String toString() {
        return "Papyrus{" +
                "year=" + year +
                ", written='" + written + '\'' +
                '}';
    }
}
