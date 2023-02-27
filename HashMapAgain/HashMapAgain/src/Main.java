import Collections.Lear.InerHashMap;
import Collections.Lear.InerHashSet;

public class Main {
    public static void main(String[] args) {
        // this map
        InerHashMap logoDictionary = new InerHashMap("Logo Dictionare");
        logoDictionary.addToDictionary("W", "Wolvagen ");
        logoDictionary.addToDictionary("V", "Volvo");
        logoDictionary.addToDictionary("A", "Audi");
        logoDictionary.printDictionary();

        // this set
        InerHashSet recordList = new InerHashSet("Records set");
        recordList.addSets("Volvo");
        recordList.addSets("BMW");
        recordList.addSets("BMW");// this is not unique
        recordList.printSet();


    }
}