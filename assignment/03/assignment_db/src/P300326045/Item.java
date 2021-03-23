package P300326045;

import java.util.Objects;

public abstract class Item {
    protected Integer itemId;
    protected String itemName;
    protected Double unitPrice;
    protected Double totalPrice;

    public Item(Integer itemId, String itemName, Double unitPrice) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.unitPrice = unitPrice;
    }

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
