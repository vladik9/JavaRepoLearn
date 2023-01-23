package Composition.First;

public class Room {
    private Floor roomFloor;
    private Door roomDoor;
    private Chair roomChair;
    private Bed roomBed;
    private Ceiling roomCeiling;
    private Dimensions roomDimensions;

    public Room(Floor roomFloor, Door roomDoor, Chair roomChair, Bed roomBed, Ceiling roomCeiling, Dimensions roomDimensions) {
        this.roomFloor = roomFloor;
        this.roomDoor = roomDoor;
        this.roomChair = roomChair;
        this.roomBed = roomBed;
        this.roomCeiling = roomCeiling;
        this.roomDimensions = roomDimensions;
    }

    public void openDoorToExitRoom(boolean roomKey) {
        roomDoor.openDor(roomKey);
    }

    public Floor getRoomFloor() {
        return roomFloor;
    }

    private Door getRoomDoor() {
        return roomDoor;
    }

    public Chair getRoomChair() {
        return roomChair;
    }

    public Bed getRoomBed() {
        return roomBed;
    }

    public Ceiling getRoomCeiling() {
        return roomCeiling;
    }

    public Dimensions getRoomDimensions() {
        return roomDimensions;
    }
}
