package Shopings.ShopingList;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class shoppingItemList {
    private final Map<String, selItem> stockItemList;

    public shoppingItemList() {
        this.stockItemList = new HashMap<>();
    }

    public boolean addItemsIntoList(selItem newItem) {

        selItem existingItem = stockItemList.get(newItem.getItemName());
        if (existingItem == null) {
            stockItemList.put(newItem.getItemName(), newItem);
            return true;
        } else {
            if (existingItem.getItemPrice() == newItem.getItemPrice()) {
                existingItem.updateItemQuantity(newItem.getItemQuantity());
            } else {
                existingItem.updateItemQuantity(newItem.getItemQuantity());
                existingItem.setItemPrice(newItem.getItemPrice());
            }


            return true;

        }
    }

    public Map<String, selItem> getListOfItems() {
        return Collections.unmodifiableMap(stockItemList);
    }

    @Override
    public String toString() {
        String s = "\nShopping List\n";
        double totalCost = 0.0;
        for (Map.Entry<String, selItem> item : stockItemList.entrySet()) {
            selItem stockItem = item.getValue();

            double itemValue = stockItem.getItemPrice() * stockItem.getItemQuantity();

            s = s + stockItem + ". There are " + stockItem.getItemQuantity() + " in stock. Value of items: ";
            s = s + String.format("%.2f", itemValue) + "\n";
            totalCost += itemValue;
        }

        return s + "Total stock value " + totalCost;
    }
}

