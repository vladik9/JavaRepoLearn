public class Main {
    public static void main(String[] args) {

        BoxCollection boxCollection = new BoxCollection();
        Box tempBox = new Box("box1", 126, 324);

        if (boxCollection.addIntoBoxSet(tempBox)) {
            System.out.println("Added");
        } else {
            System.out.println("Not added");
        }


        tempBox = new Box("box2", 234, 255);

        if (boxCollection.addIntoBoxSet(tempBox)) {
            System.out.println("Added");
        } else {
            System.out.println("Not added");
        }

        tempBox = new Box("box3", 212, 455);

        if (boxCollection.addIntoBoxSet(tempBox)) {
            System.out.println("Added");
        } else {
            System.out.println("Not added");


        }

        tempBox = new Box("box1", 212, 455);

        if (boxCollection.addIntoBoxSet(tempBox)) {
            System.out.println("Added");
        } else {
            System.out.println("Not added");

        }

        boxCollection.printCollection();

    }
}