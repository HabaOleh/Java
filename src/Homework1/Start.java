package Homework1;

public class Start {
    public static void main(String[] args) {

        Engine engine1 = new Engine(400,3,"ej204x",220);
        Car car1 = new Car("BMW","Black",2018,engine1);
        Driver driver1 = new Driver("Max",38,5,car1);
        System.out.println(driver1);

        Engine engine2 = new Engine(350,2,"ej318x",200);
        Driver driver2 = new Driver("Vasya",22,3,"Subary","white",2014,engine2);
        System.out.println(driver2);

        Car car2 = new Car("mercedes","red",2016,300,3,"er203x",190);
        System.out.println("Car:"+car2);
    }
}
