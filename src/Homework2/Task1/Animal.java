package Homework2.Task1;

public class Animal {
    private String type;
    private int age;

    public Animal() {
    }

    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", age=" + age +
                '}';
    }
}
