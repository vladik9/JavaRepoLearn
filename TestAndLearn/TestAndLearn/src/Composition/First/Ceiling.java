package Composition.First;

public class Ceiling {
    private Dimensions ceilingDimensions;
    private String ceilingColor;

    public Ceiling(Dimensions ceilingDimensions, String ceilingColor) {
        this.ceilingDimensions = ceilingDimensions;
        this.ceilingColor = ceilingColor;
    }

    public Dimensions getCeilingDimensions() {
        return ceilingDimensions;
    }

    public String getCeilingColor() {
        return ceilingColor;
    }
}
