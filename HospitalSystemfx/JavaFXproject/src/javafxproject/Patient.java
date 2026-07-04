package javafxproject;

public class Patient extends Person {

    private int Age;
    private String gender;

    public Patient(int Age, String gender, String FullName, int Id) {
        super(FullName, Id);
        this.Age = Age;
        this.gender = gender;
    }

    public Patient() {
        this(0,"","",0);
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return super.toString() + "Patient{" + "Age=" + Age + ", gender=" + gender + '}';
    }


}
