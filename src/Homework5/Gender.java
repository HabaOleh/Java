package Homework5;

public enum Gender {
    Male("Man"),
    Female("Woman");

    private String gender;

    Gender() {
    }

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "gender='" + gender + '\'' +
                "} " + super.toString();
    }
}
