package javafxproject;

import java.util.Arrays;

public abstract class Clinic {

    private Doctor[] doctors;
    private static String HospitalCEO;

    public Clinic(Doctor[] doctors) {
        this.doctors = doctors;
        setHospitalCEO("DR.ALI HAMAD");
    }

    public Clinic() {
    }

    

    public Doctor[] getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctor[] doctors) {
        this.doctors = doctors;
    }

    public static String getHospitalCEO() {
        return HospitalCEO;
    }

    public static void setHospitalCEO(String HospitalCEO) {
        Clinic.HospitalCEO = HospitalCEO;
    }

    @Override
    public String toString() {
        return String.format("Doctors: %s",doctors);
    }

    public void DisplayDoctorInfo() {
        for (int i = 0; i < doctors.length; i++) {
            System.out.print(doctors[i]);
        }
    }

    public abstract double ConsultationCharge();
}
