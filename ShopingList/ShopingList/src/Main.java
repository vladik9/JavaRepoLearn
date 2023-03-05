import Shopings.ShopingList.*;

public class Main {

    public static void main(String[] args) {
        shoppingItemList goodsList = new shoppingItemList();

        selItem tempItem = new selItem("Milk", 22.3, 6);
        goodsList.addItemsIntoList(tempItem);

        tempItem = new selItem("Meat", 50.2, 10);
        goodsList.addItemsIntoList(tempItem);

        tempItem = new selItem("Bread", 15.0, 20);
        goodsList.addItemsIntoList(tempItem);

        tempItem = new selItem("Sugar", 5, 5);
        goodsList.addItemsIntoList(tempItem);


        tempItem = new selItem("Sugar", 5, 5);
        goodsList.addItemsIntoList(tempItem);
        tempItem = new selItem("Sugar", 5, 5);
        goodsList.addItemsIntoList(tempItem);
        System.out.println("##################################");
        System.out.println("Initial goods list: " + goodsList.toString());
        System.out.println("##################################");

        System.out.println("Here is the user: :)");

        Basket vladSBasket = new Basket("Vlad");

        vladSBasket.addItemIntoBasket("Sugar", 2, goodsList, 1);
        vladSBasket.addItemIntoBasket("Bread", 1, goodsList, 2);
        vladSBasket.addItemIntoBasket("Milk", 3, goodsList, 3);
        System.out.println("##################################");
        System.out.println("After user added into the bag " + goodsList.toString());
        System.out.println("##################################");

        System.out.println("##################################");
        System.out.println("User basket contains now " + vladSBasket.toString());
        System.out.println("##################################");

    }

}
