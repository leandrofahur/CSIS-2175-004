package P300326045;

public abstract class Item {
    protected Integer itemId;
    protected String itemName;
    protected Double unitPrice;
    protected Double totalPrice;

    public abstract Integer getItemId();

    public abstract void setItemId(Integer itemId);

    public abstract String getItemName();

    public abstract void setItemName(String itemName);

    public abstract Double getUnitPrice();

    public abstract void setUnitPrice(Double unitPrice);

    public abstract Double getTotalPrice();

    public abstract void setTotalPrice(Double totalPrice);

    @Override
    public abstract String toString();
}
