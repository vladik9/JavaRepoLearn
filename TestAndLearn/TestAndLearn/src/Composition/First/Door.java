package Composition.First;

public class Door {
    private Dimensions doorDimensions;
    private String color;
    private boolean isDorLocked;

    public Door(Dimensions doorDimensions, String color, boolean isDorLocked) {
        this.doorDimensions = doorDimensions;
        this.color = color;
        this.isDorLocked = isDorLocked;
    }

    public Dimensions getDoorDimensions() {
        return doorDimensions;
    }

    public String getColor() {
        return color;
    }

    public boolean isDorLocked() {
        return isDorLocked;
    }

    public void openDor(boolean key) {
        this.isDorLocked = key ? true : false;
        if (!isDorLocked) {
            System.out.println("Door is locked you can't open it.");
        } else System.out.println("You can open door.");


    }
}

