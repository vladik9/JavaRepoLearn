import java.util.Objects;

public class Box {
    private final String boxPurpose;
    private final double boxLength;
    private final double boxHeight;

    public Box(String boxPurpose, double boxLength, double boxHeight) {
        this.boxPurpose = boxPurpose;
        this.boxLength = boxLength;
        this.boxHeight = boxHeight;
    }

    public String getBoxPurpose() {
        return boxPurpose;
    }

    public double getBoxLength() {
        return boxLength;
    }

    public double getBoxHeight() {
        return boxHeight;
    }

 
}
