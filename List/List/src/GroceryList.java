//import java.util.ArrayList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class GroceryList {
    private final LinkedList<String> groceryList;
//    private ArrayList<String> groceryList;

    public GroceryList() {
//        groceryList = new ArrayList<String>();
        groceryList = new LinkedList<String>();
    }

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    private int indexOfGroceryItem(String item) {
        return groceryList.indexOf(item);

    }

    public String getGroceryItem(String item) {
        int isElementInTheList = indexOfGroceryItem(item);
        return isElementInTheList == -1 ? "Element not founded " : "Element is: " + groceryList.get(isElementInTheList);
    }

    public void printGroceryList() {
        int index = 0;
        for (String el : groceryList) {
            System.out.println("Item is [" + (index + 1) + "]= " + el);
            index++;

        }
    }

    //Iterator can traverse only in forward direction
    public void printGroceryListUsingIterator() {
        Iterator<String> listIterator = groceryList.iterator();
        int index = 0;
        while (listIterator.hasNext()) {
            System.out.println("Item is [" + (index + 1) + "]= " + listIterator.next());
            index++;
        }
    }

    //ListIterator traverses both in forward and backward directions
    public void printGroceryListUsingListIterator() {
        ListIterator<String> listIterator = groceryList.listIterator();
        int index = 0;
        while (listIterator.hasNext()) {
            System.out.println("Item is [" + (index + 1) + "]= " + listIterator.next());
            index++;
        }
    }

    public void removeOneGroceryItem(String item) {
        int isElementInTheList = indexOfGroceryItem(item);
        if (isElementInTheList == -1)
            System.out.println("Item is not in the list!");
        else {
            groceryList.remove(isElementInTheList);
            System.out.println("Element " + item + " successfully removed from list!");
        }

    }


}