package javafxproject;

public class EyesClinic extends Clinic {

    private boolean isGlassesPrescription;
    private boolean isContactLensFitting;

    public EyesClinic(boolean isGlassesPrescription, boolean isContactLensFitting, Doctor[] doctors) {
        super(doctors);
        this.isGlassesPrescription = isGlassesPrescription;
        this.isContactLensFitting = isContactLensFitting;
    }

    public EyesClinic(boolean isGlassesPrescription, boolean isContactLensFitting) {
        this.isGlassesPrescription = isGlassesPrescription;
        this.isContactLensFitting = isContactLensFitting;
    }

    public EyesClinic() {
        this(false,false);
    }

    public boolean getisIsGlassesPrescription() {
        return isGlassesPrescription;
    }

    public void setIsGlassesPrescription(boolean isGlassesPrescription) {
        this.isGlassesPrescription = isGlassesPrescription;
    }

    public boolean getisIsContactLensFitting() {
        return isContactLensFitting;
    }

    public void setIsContactLensFitting(boolean isContactLensFitting) {
        this.isContactLensFitting = isContactLensFitting;
    }

    @Override
    public String toString() {
        return String.format("%s\n is Glasses Prescriptions: %b\n is ContactLens Fitting:%b\n", super.toString(), isGlassesPrescription, isContactLensFitting);
    }

    public void PrescribleEyeMedication() {
        System.out.println("antibiotic:\n"
                + "1-gentamicin \n"
                + "2-Tetracycline \n"
                + "3-naphcon-a\n"
                + "4-natamycin "
                + "Eye drop for dry eyes:\n"
                + "1-Refresh-Liquigel Eye Drop\n"
                + "2-Systane Ultra Eye Drop\n"
                + "3-Polyfresh Eye Drops\n"
                + "4-Hyfresh 0.2% Eye Drops\n"
                + "5-Blink Eye Drops");
    }

    @Override
    public double ConsultationCharge() {
        return 120;
    }

}
