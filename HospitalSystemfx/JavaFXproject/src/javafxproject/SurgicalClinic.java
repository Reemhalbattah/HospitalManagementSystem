package javafxproject;

public class SurgicalClinic extends Clinic {

    private String Surgeon;
    private int SuergeryRooms;

    public SurgicalClinic(String Surgeon, int SuergeryRooms, Doctor[] doctors) {
        super(doctors);
        this.Surgeon = Surgeon;
        this.SuergeryRooms = SuergeryRooms;
    }

   

    public SurgicalClinic() {
        this("",0,null);
    }

    public String getSurgeon() {
        return Surgeon;
    }

    public void setSurgeon(String Surgeon) {
        this.Surgeon = Surgeon;
    }

    public int getSuergeryRooms() {
        return SuergeryRooms;
    }

    public void setSuergeryRooms(int SuergeryRooms) {
        this.SuergeryRooms = SuergeryRooms;
    }

    @Override
    public String toString() {
        return String.format("%s\n Surgeon:%s\n Suergery Rooms:%d\n", super.toString(), Surgeon, SuergeryRooms);
    }

    public void RequirmentsBeforeSurgery() {
        System.out.println("Show up 2 hours before your surgery \n"
                + "Stop Smoking \n"
                + "Fast 8 hours before your surgery");
    }

    @Override
    public double ConsultationCharge() {
        return 140;
    }

}
