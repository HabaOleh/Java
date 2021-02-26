package Homework2.Task3;

public class Woman implements WomanClothes {
    private String name;
    private int age;
    private String gender;
    private String clothes;

    public Woman() {
    }

    public Woman(String name, int age, String gender, String clothes) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.clothes = clothes;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    @Override
    public void dressWomen() {
        System.out.println("Dress woman " + name+ " in " + clothes);
    }


    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", clothes='" + clothes + '\'' +
                '}';
    }
}
