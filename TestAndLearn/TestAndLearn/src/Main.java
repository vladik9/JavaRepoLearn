import Composition.First.*;

public class Main {
    public static void main(String[] args) {
        Ceiling roomCeiling = new Ceiling(new Dimensions(2200, 5500), "White");
        Door roomDoor = new Door(new Dimensions(200, 300), "Brown", true);
        Chair roomChair = new Chair(new Dimensions(150, 200), "Black");
        Bed roomBed = new Bed(new Dimensions(400, 500), 3, new Blanket(new Dimensions(300, 450), "Wool"));
        Floor roomFloor = new Floor(new Dimensions(2200, 5500), "Dark-yellow");
        Dimensions roomDimensions = new Dimensions(2200, 5500);
        Room vladRoom = new Room(roomFloor, roomDoor, roomChair, roomBed, roomCeiling, roomDimensions);

        vladRoom.openDoorToExitRoom(true);
    }
}