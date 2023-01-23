package Composition.First;

public class Chair {
    private Dimensions chairDimension;
    private String chairColor;

    public Chair(Dimensions chairDimension, String chairColor) {
        this.chairDimension = chairDimension;
        this.chairColor = chairColor;
    }

    public Dimensions getChairDimension() {
        return chairDimension;
    }

    public String getChairColor() {
        return chairColor;
    }
}
