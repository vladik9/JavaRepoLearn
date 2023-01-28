
class Main {


    public static void main(String[] args) {
        GroceryList myGroceryList = new GroceryList();
        myGroceryList.addGroceryItem("Sous");
        myGroceryList.addGroceryItem("Carne");
        myGroceryList.addGroceryItem("Mamaliga");
        myGroceryList.addGroceryItem("Iepure");
        System.out.println("Grocery list after add: ");
        //print using a forEach
//        myGroceryList.printGroceryList();
        //printing using iterator
//        myGroceryList.printGroceryListUsingIterator();
        //this is using listIterator
        myGroceryList.printGroceryListUsingListIterator();
        System.out.println(myGroceryList.getGroceryItem("747"));
        System.out.println("Grocery list after remove: ");
        myGroceryList.removeOneGroceryItem("Mamaliga");
        myGroceryList.printGroceryList();


    }
}