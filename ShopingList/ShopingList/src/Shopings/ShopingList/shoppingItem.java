package Shopings.ShopingList;

public class shoppingItem implements Comparable<shoppingItem> {
    private final String itemName;
    private double itemPrice;
    private int itemQuantity;

    public shoppingItem(String itemName, double itemPrice, int itemQuantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getItemQuantity() {
        if (itemQuantity > 0) return itemQuantity;
        else return 0;
    }


    public double updatePrice(int newPrice) {
        if (newPrice > 0) return itemPrice = newPrice;
        return 0.0;
    }

    public int updateQuantity(int newQuantity) {
        if (newQuantity > 0) {
            itemQuantity += newQuantity;
        } else {
            itemQuantity = newQuantity;
        }
        return itemQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        shoppingItem that = (shoppingItem) o;

        if (Double.compare(that.getItemPrice(), getItemPrice()) != 0) return false;
        if (getItemQuantity() != that.getItemQuantity()) return false;
        return getItemName() != null ? getItemName().equals(that.getItemName()) : that.getItemName() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getItemName() != null ? getItemName().hashCode() : 0;
        temp = Double.doubleToLongBits(getItemPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getItemQuantity();
        return result;
    }

    @Override
    public String toString() {
        return "shopingItem{" +
                "itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", itemQuantity=" + itemQuantity +
                '}';
    }

    @Override
    public int compareTo(shoppingItem o) {
        System.out.println("Entering StockItem.compareTo");
        if (this == o) {
            return 0;
        }

        if (o != null) {
            return this.itemName.compareTo(o.getItemName());
        }

        throw new NullPointerException();
    }


}
