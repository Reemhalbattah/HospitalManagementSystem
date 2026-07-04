package javafxproject;

public class Doctor extends Person {

    private int yearsOfExperince;
    private String Specialization;
    private Appointments[] appointment;

    public Doctor(int yearsOfExperince, String Specialization, Appointments[] appointment, String FullName, int Id) {
        super(FullName, Id);
        this.yearsOfExperince = yearsOfExperince;
        this.Specialization = Specialization;
        this.appointment = appointment;
    }

    public Doctor() {
        this(0,"",null,"",0);
    }

    public int getYearsOfExperince() {
        return yearsOfExperince;
    }

    public void setYearsOfExperince(int yearsOfExperince) {
        this.yearsOfExperince = yearsOfExperince;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }

    public Appointments[] getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointments[] appointment) {
        this.appointment = appointment;
    }

    @Override
    public String toString() {
        return String.format("%syears Of Experince:%d\nSpecialization:%s\n",super.toString(),yearsOfExperince,Specialization);
    }

}
