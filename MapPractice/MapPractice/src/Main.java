import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Map<Map, Map> testMap = new HashMap<Map, Map>();
        Map<String, String> myMap = new HashMap<>();
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        while (flag) {
            System.out.println("1. Add an item to map list");
            System.out.println("2. Print list");
            System.out.println("3. Get one key-value");
            System.out.println("Q. Quit program");
            String choise = scanner.nextLine();

            if (choise.equals("Q")) {
                flag = false;
            } else if (choise.equals("1")) {
                System.out.println("Enter item key: ");
                String itemKey = scanner.nextLine();
                System.out.println("Enter item value: ");
                String itemValue = scanner.nextLine();
                addItemToMap(myMap, itemKey, itemValue);
            } else if (choise.equals("2")) {
                printList(myMap);
            } else if (choise.equals("3")) {
                System.out.println("Enter key name:  ");
                String theKey = scanner.nextLine();
                printOneItemValue(myMap, theKey);
            }

        }


    }

    public static void addItemToMap(Map<String, String> list, String itemKey, String itemValue) {
        list.put(itemKey, itemValue);
        System.out.println(itemKey + " added to list");
    }

    public static void printOneItemValue(Map<String, String> list, String key) {
        if (list.size() != 0 && list.get(key) != null) System.out.println(list.get(key));
        else System.out.println("No such record");
    }

    public static void printList(Map<String, String> list) {
        Iterator<Map.Entry<String, String>> newIterator = list.entrySet().iterator();
        while (newIterator.hasNext()) {
            Map.Entry<String, String> newMap
                    = (Map.Entry<String, String>) newIterator.next();
            System.out.println(newMap.getKey() + " = " + newMap.getValue());
        }

    }


}