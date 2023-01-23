package Composition.First;

public class Floor {
    private Dimensions florDimensions;
    private String floorColor;

    public Floor(Dimensions florDimensions, String floorColor) {
        this.florDimensions = florDimensions;
        this.floorColor = floorColor;
    }

    public Dimensions getFlorDimensions() {
        return florDimensions;
    }

    public String getFloorColor() {
        return floorColor;
    }
}
