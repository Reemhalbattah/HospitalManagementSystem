package javafxproject;

public class Appointments implements Priceable {

    private DateTime dateTime;
    private String ClinicType;
    private Patient patient;
    private boolean Avalible;

    public Appointments(DateTime dateTime, String ClinicType, Patient patient, boolean Avalible) {
        this.dateTime = dateTime;
        this.ClinicType = ClinicType;
        this.patient = patient;
        this.Avalible = Avalible;
    }

    public Appointments() {
        this(null,"",null,false);
    }

    public DateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getClinicType() {
        return ClinicType;
    }

    public void setClinicType(String ClinicType) {
        this.ClinicType = ClinicType;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public double Calcable() {
        if (ClinicType.equals("Orthopedic Clinc")) {
            return (300 + (300 * Priceable.VAT));
        } else if (ClinicType.equals("Surgical Clinc")) {
            return (340 + (340 * Priceable.VAT));
        } else if (ClinicType.equals("Eyes Clinc ")) {
            return (150 + (150 * Priceable.VAT));
        } else {

            return 0;
        }
    }

    public boolean getAvalible() {
        return Avalible;
    }

    public void setAvalible(boolean Avalible) {
        this.Avalible = Avalible;
    }

    public void AppointmentBooking() {
        System.out.println("The Appintment Has Been Booked Successfully!");

    }

    public void CancelAppointmen() {
       System.out.println("The Appointment has been Canceled Successfully.");

    }

    public boolean isAvalible() {
        if (Avalible) {
            return true;
        } else {
            return false;
        }

    }

    

}
