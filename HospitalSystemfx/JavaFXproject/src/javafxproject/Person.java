package javafxproject;

public class Person {

    private String FullName;
    private int Id;

    public Person(String FullName, int Id) {
        this.FullName = FullName;
        this.Id = Id;
    }

    public Person() {
        this("",0);
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    @Override
    public String toString() {
        return String.format("Full Name:%S\n ID:%d\n",FullName,Id);
    }

    public void displayFullName() {
        System.out.println("FullName:" + FullName);
    }

}
