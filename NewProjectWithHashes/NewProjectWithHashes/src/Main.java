import SomePackege.Remember.Hashes;

public class Main {
    public static void main(String[] args) {

        Hashes myHashList = new Hashes("My Collection of hashes.");

        myHashList.addIntoSet(new Hashes("one collection"));
        myHashList.addIntoSet(new Hashes("two collection"));
        myHashList.addIntoSet(new Hashes("three collection"));
        myHashList.addIntoSet(new Hashes("two collection"));
        myHashList.printMyCollection();
    }
}