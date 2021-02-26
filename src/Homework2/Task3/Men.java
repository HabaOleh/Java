package Homework2.Task3;

public class Men implements MenClothes{
    private int age;
    private String name;
    private String gender;

    public Men() {
    }

    public Men(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void dressMen() {
        System.out.println("Dress the man "+ name);
    }

    @Override
    public String toString() {
        return "Men{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
