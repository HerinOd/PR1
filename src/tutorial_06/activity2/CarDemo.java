package tutorial_06.activity2;

public class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car(50);

        myCar.addGas(150);
        myCar.drive(1000);

        System.out.println("Gas left: " + myCar.getGasInTank());

    }

}
