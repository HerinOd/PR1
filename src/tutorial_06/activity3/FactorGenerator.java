package tutorial_06.activity3;

public class FactorGenerator {
    private final int numberToFactor;
    private int currentFactor;
    private int remainingNumber;

    public FactorGenerator(int numberToFactor) {
        this.currentFactor = 2;
        this.remainingNumber = numberToFactor;
        this.numberToFactor = numberToFactor;
    }

    public boolean hasMoreFactors() {
        return remainingNumber > 1;
    }

    public int nextFactor() {
        while (remainingNumber % currentFactor != 0) {
            currentFactor++;
        }
        remainingNumber /= currentFactor;
        return currentFactor;
    }

    public int getNumberToFactor() {
        return numberToFactor;
    }

}
