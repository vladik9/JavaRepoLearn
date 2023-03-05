package Shopings.ShopingList;

public class selItem implements Comparable<selItem> {
    private final String itemName;
    private double itemPrice;
    private int itemQuantity;

    public selItem(String itemName, double itemPrice, int itemQuantity) {
        this.itemName = itemName;
        if (itemPrice > 0) {
            this.itemPrice = itemPrice;
        } else this.itemPrice = 1;
        this.itemQuantity = itemQuantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public boolean updateItemQuantity(int newQuantity) {
        if (newQuantity != 0) {
            itemQuantity = itemQuantity + newQuantity;
            return true;
        }
        return false;
    }

    public boolean setItemPrice(double newItemPrice) {
        if (newItemPrice > 0) {
            itemPrice += newItemPrice;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "selItem{" +
                "itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", itemQuantity=" + itemQuantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || (o.getClass() != this.getClass())) return false;
        String objName = ((selItem) o).getItemName();
        return this.itemName.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.itemName.hashCode() + 37;
    }

    @Override
    public int compareTo(selItem o) {
        if (this == o) {
            return 0;
        }
        if (o != null) {
            return this.itemName.compareTo(o.getItemName());
        }
        throw new NullPointerException();
    }
}
