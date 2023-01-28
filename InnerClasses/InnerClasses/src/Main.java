import Home.Room.Home;

public class Main {
    public static void main(String[] args) {
        Home myHome = new Home("Vlad's Home", 3, "Kitchen", 453);
//Calling inner class from outside using main class
//        Home.Room roomName= myHome.new Room("RoomName", 12341);
        myHome.addNewRoosIntoHouse("Beth room", 400);
        myHome.addNewRoosIntoHouse("Bed room", 456);


        myHome.printAllRooms();
    }
}