package P300326045;

public abstract class Item {
    // protected types to ensure the child classes can access it:
    protected Integer itemId;
    protected String itemName;
    protected Double unitPrice;
    protected Double totalPrice;

    // default constructor:
    public Item() {
        // ...
    }

    // constructor to insert all the required attributes:
    public Item(Integer itemId, String itemName, Double unitPrice) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.unitPrice = unitPrice;
    }

    // getters required from specifications:
    public abstract Integer getItemId();
    public abstract String getItemName();
    public abstract Double getUnitPrice();
    public abstract Double getTotalPrice();

    // setters (alternative to the constructor and very useful with the default constructor.
    public abstract void setItemId(Integer itemId);
    public abstract void setItemName(String itemName);
    public abstract void setUnitPrice(Double unitPrice);

    public abstract void setTotalPrice(Double totalPrice);

    @Override
    public abstract String toString();


}
