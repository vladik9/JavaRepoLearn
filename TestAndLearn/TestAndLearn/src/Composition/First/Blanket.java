package Composition.First;

public class Blanket {
    private Dimensions blanketDimensions;
    private String blanketMaterial;

    public Blanket(Dimensions blanketDimensions, String blanketMaterial) {
        this.blanketDimensions = blanketDimensions;
        this.blanketMaterial = blanketMaterial;
    }

    public Dimensions getBlanketDimensions() {
        return blanketDimensions;
    }

    public String getBlanketMaterial() {
        return blanketMaterial;
    }
}
