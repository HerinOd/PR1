package tutorial_06.activity2;

public class Car {
    private double fuelEfficiency;
    private double fuelLevel;

    public Car(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
        fuelLevel = 0;
    }

    public void drive(double distance) {
        double gasConsumed = distance / this.fuelEfficiency;
        fuelLevel -= gasConsumed;
    }

    public double getGasInTank() {
        return this.fuelLevel;
    }

    public void addGas(double amount) {
        this.fuelLevel += amount;
    }

}
