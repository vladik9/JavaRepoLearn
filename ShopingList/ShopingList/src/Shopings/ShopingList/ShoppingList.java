package Shopings.ShopingList;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ShoppingList {
    private final Map<String, shoppingItem> shopingList;

    public ShoppingList() {
        this.shopingList = new HashMap<>();
    }

    public Map<String, shoppingItem> getShoppingList() {
        return Collections.unmodifiableMap(shopingList);
    }

    public int addInShoppingList(shoppingItem item, int amount) {
        shoppingItem existingItem = shopingList.get(item);
        if (existingItem != null) {
            existingItem.updateQuantity(-amount);
            shopingList.put(item.getItemName(), item);
        } else {
            System.out.println("We don't have item: " + item.getItemName() + " for selling!");
        }
        return existingItem.getItemQuantity();
    }


}
