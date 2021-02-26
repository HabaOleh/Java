package Homework1;

public class Engine {
    private int power;
    private int volume;
    private String type;
    private int maxSpeed;

    public Engine(){

    }

    public Engine(int power, int volume,String type,int maxSpeed){
        this.power=power;
        this.volume=volume;
        this.type=type;
        this.maxSpeed=maxSpeed;
    }
    public void setPower(int power){
        this.power=power;
    }
    public int getPower(){
        return power;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getVolume() {
        return volume;
    }

    public void setType(String type){
        this.type=type;
    }
    public String getType(){
        return type;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed=maxSpeed;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public String toString(){
        return " power = "+power+
                " volume = "+ volume+
                " type = "+type+
                " maxSpeed = "+maxSpeed;
    }
}
