package Shopings.ShopingList;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Basket {
    private final String userBasketName;
    private final Map<Integer, selItem> userBasket;


    public Basket(String userBasketName) {
        this.userBasketName = userBasketName;
        this.userBasket = new HashMap<>();

    }

    public String getUserBasketName() {
        return userBasketName;
    }

    public Map<Integer, selItem> getUserBasket() {
        return Collections.unmodifiableMap(userBasket);
    }

    public boolean addItemIntoBasket(String newItem, int quantity, shoppingItemList goodsList, int order) {

        selItem existingItem = goodsList.getListOfItems().getOrDefault(newItem, null);
        if (existingItem != null) {
            System.out.println("Item: " + existingItem.getItemName() + " quantity " + quantity);
            existingItem.updateItemQuantity(-quantity);
            userBasket.put(order, new selItem(existingItem.getItemName(), existingItem.getItemPrice(), quantity));
            return true;
        } else {
            System.out.println("We are not selling " + newItem);
            return false;
        }
    }

    public boolean removeFromBasket(String item, int quantity) {

        // this can be implemented at some point
        userBasket.getOrDefault(item, null);

        return true;

    }

    @Override
    public String toString() {
        String s = "\nBasket List\n";
        double totalCost = 0.0;

        for (Map.Entry<Integer, selItem> item : userBasket.entrySet()) {
            selItem individualItem = item.getValue();
            System.out.println(individualItem);
            totalCost += individualItem.getItemPrice() * individualItem.getItemQuantity();
        }

        return s + "Total stock value " + totalCost;
    }
}
