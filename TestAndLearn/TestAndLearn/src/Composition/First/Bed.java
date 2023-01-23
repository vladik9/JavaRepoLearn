package Composition.First;

public class Bed {
    private Dimensions bedDimensions;
    private int numberOfBedPillows;
    private Blanket bedBlanket;

    public Bed(Dimensions bedDimensions, int numberOfBedPillows, Blanket bedBlanket) {
        this.bedDimensions = bedDimensions;
        this.numberOfBedPillows = numberOfBedPillows;
        this.bedBlanket = bedBlanket;

    }

    public Dimensions getBedDimensions() {
        return bedDimensions;
    }

    public int getNumberOfBedPillows() {
        return numberOfBedPillows;
    }

    public Blanket getBedBlanket() {
        return bedBlanket;
    }


}

