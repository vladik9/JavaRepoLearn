package Home.Room;

import java.util.ArrayList;

public class Home {
    private String homeName;
    private int numberOfRooms;
    private ArrayList<Room> rooms;

    public Home(String homeName, int numberOfRooms, String firstRoomName, int firstRoomSize) {
        this.homeName = homeName;
        this.numberOfRooms = numberOfRooms;
        this.rooms = new ArrayList<>();
        this.rooms.add(new Room(firstRoomName, firstRoomSize));
    }

    public void printAllRooms() {
        System.out.println("In home " + this.homeName + " we have " + this.numberOfRooms + " rooms");
        for (Room room : rooms) {
            System.out.println("Room name " + room.getRoomName() + " we have size: " + room.getRoomSize());
        }

    }

    public void addNewRoosIntoHouse(String roomName, int roomSize) {
        Room newRoom = new Room(roomName, roomSize);
        rooms.add(newRoom);
    }

    //most of the time will be private, but can be set as public in case we want to have access from outside
    private class Room {
        private String roomName;
        private int roomSize;

        public Room(String roomName, int roomSize) {
            this.roomName = roomName;
            this.roomSize = roomSize;
        }

        public String getRoomName() {
            return roomName;
        }

        public void setRoomName(String roomName) {
            this.roomName = roomName;
        }

        public int getRoomSize() {
            return roomSize;
        }

        public void setRoomSize(int roomSize) {
            this.roomSize = roomSize;
        }
    }
}
