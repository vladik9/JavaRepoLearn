public class Main {
    public static void main(String[] args) {
        System.out.println("Main program");

        SetClass mySet = new SetClass("My set");
        mySet.addIntoSet(new SetClass("Set item 1"));
        mySet.addIntoSet(new SetClass("Set item 2"));
        mySet.addIntoSet(new SetClass("Set item 3"));


        mySet.printSetItems();

    }
}