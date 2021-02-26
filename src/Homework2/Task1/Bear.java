package Homework2.Task1;

public class Bear extends Wild{
    private boolean isSleep;

    public Bear() {
    }

    public Bear(String type, int age, boolean isAloneHunter, String species, boolean isSleep) {
        super(type, age, isAloneHunter, species);
        this.isSleep = isSleep;
    }

    public boolean isSleep() {
        return isSleep;
    }

    public void setSleep(boolean sleep) {
        isSleep = sleep;
    }

    @Override
    public String toString() {
        return "Bear{" +
                "isSleep=" + isSleep +
                "} " + super.toString();
    }
}
