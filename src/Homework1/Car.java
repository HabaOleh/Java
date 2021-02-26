package Homework1;

public class Car {
    private String model;
    private String color;
    private int year;
    private Engine engine;

    public Car() {
    }

    public Car(String model, String color, int year, Engine engine) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.engine = engine;
    }
    public Car(String model, String color, int year, int power, int volume,String type,int maxSpeed) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.engine = new Engine( power,  volume, type, maxSpeed);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String toString(){
        return " Model = "+model+
                " Color = "+ color+
                " Year = " + year+
                " Engine:" + engine;
    }
}
