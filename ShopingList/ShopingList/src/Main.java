import Shopings.ShopingList.Basket;
import Shopings.ShopingList.ShoppingList;
import Shopings.ShopingList.shoppingItem;

public class Main {
    private static ShoppingList stockList = new ShoppingList();

    public static void main(String[] args) {


        shoppingItem temp = new shoppingItem("bread", 10, 20);
        stockList.addInShoppingList(temp, 1);

        temp = new shoppingItem("milk", 8, 10);
        stockList.addInShoppingList(temp, 1);
        temp = new shoppingItem("oil", 3, 5);
        stockList.addInShoppingList(temp, 1);
        temp = new shoppingItem("soda", 2, 2);
        stockList.addInShoppingList(temp, 1);
        temp = new shoppingItem("meat", 5, 5);
        stockList.addInShoppingList(temp, 1);


        Basket myBasket = new Basket("Vlad");


        myBasket.

    }
}