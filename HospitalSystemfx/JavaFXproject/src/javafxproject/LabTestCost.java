package javafxproject;

public class LabTestCost implements Priceable {

    private double testFee;
    private int numberOfTests;

    public LabTestCost(double testFee, int numberOfTests) {
        this.testFee = testFee;
        this.numberOfTests = numberOfTests;
    }

    public LabTestCost() {
        this(0.0,0);
    }

    public double getTestFee() {
        return testFee;
    }

    public void setTestFee(double testFee) {
        this.testFee = testFee;
    }

    public int getNumberOfTests() {
        return numberOfTests;
    }

    public void setNumberOfTests(int numberOfTests) {
        this.numberOfTests = numberOfTests;
    }

    @Override
    public double Calcable() {
        return testFee*numberOfTests;
    }

    @Override
    public String toString() {
        return "LabTestCost{" + "testFee=" + testFee + ", numberOfTests=" + numberOfTests + '}';
    }
    

}
