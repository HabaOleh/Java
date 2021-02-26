package Homework2.Task1;

public class Cat extends Homemade{
    private String voice;

    public Cat() {
    }

    public Cat(String type, int age, String species, int count, String voice) {
        super(type, age, species, count);
        this.voice = voice;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "voice='" + voice + '\'' +
                "} " + super.toString();
    }
}
