package Homework1;

public class Driver {
    private String name;
    private int age;
    private int exps;
    private Car car;

    public Driver() {
    }
    public Driver(String name, int age, int exps, Car car) {
        this.name = name;
        this.age = age;
        this.exps = exps;
        this.car = car;
    }
    public Driver(String name, int age, int exps, String model, String color, int year, Engine engine) {
        this.name = name;
        this.age = age;
        this.exps = exps;
        this.car = new Car(model, color, year, engine);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getExps() {
        return exps;
    }
    public void setExps(int exps) {
        this.exps = exps;
    }
    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }
    public String toString(){
        return "Driver:"+
                " Name = " +name+
                " Age = "+ age+
                " Exps = "+exps+
                " Car:"+ car;
    }
}
