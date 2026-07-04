package javafxproject;

public class OrthoPedicClinc extends Clinic {

    private boolean hasPhysicalTherapy;
    private boolean hasSurgicalFacilities;
    private double XrayPrice;

    public OrthoPedicClinc(boolean hasPhysicalTherapy, boolean hasSurgicalFacilities, double XrayPrice, Doctor[] doctors) {
        super(doctors);
        this.hasPhysicalTherapy = hasPhysicalTherapy;
        this.hasSurgicalFacilities = hasSurgicalFacilities;
        this.XrayPrice = XrayPrice;
    }

    

    public OrthoPedicClinc() {
        this(false,false,0.0,null);
    }

    public boolean getHasPhysicalTherapy() {
        return hasPhysicalTherapy;
    }

    public void setHasPhysicalTherapy(boolean hasPhysicalTherapy) {
        this.hasPhysicalTherapy = hasPhysicalTherapy;
    }

    public boolean getHasSurgicalFacilities() {
        return hasSurgicalFacilities;
    }

    public void setHasSurgicalFacilities(boolean hasSurgicalFacilities) {
        this.hasSurgicalFacilities = hasSurgicalFacilities;
    }

    public double getXrayPrice() {
        return XrayPrice;
    }

    public void setXrayPrice(double XrayPrice) {
        this.XrayPrice = XrayPrice;
    }

    @Override
    public String toString() {
        return String.format("%s\n has Physical Therapy:%b\nhas Surgical Facilities:%b\n X Ray Price:%f", super.toString(), hasPhysicalTherapy, hasSurgicalFacilities, XrayPrice);
    }

    @Override
    public double ConsultationCharge() {
        return 150;
    }

}
