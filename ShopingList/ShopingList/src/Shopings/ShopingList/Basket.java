package Shopings.ShopingList;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    private final Map<shoppingItem, Integer> userBasket;

    private final String userNameBasket;

    public Basket(String userName) {
        this.userNameBasket = userName;
        this.userBasket = new HashMap<>();
    }

    public double printUserBasketList() {
        double totalCost = 0;
        for (Map.Entry<shoppingItem, Integer> item : userBasket.entrySet()) {
            System.out.println(item.getKey() + ". " + item.getValue() + " purchased");
            totalCost += item.getKey().getItemPrice() * item.getValue();
        }
        return totalCost;
    }

    public boolean addIntoBasket(shoppingItem item, Integer amount) {

//here i am adding all in list , need to continue
        return true;
    }
}
