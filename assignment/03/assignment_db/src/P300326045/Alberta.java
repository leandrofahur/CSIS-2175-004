package P300326045;

public class Alberta extends Item{
    // default constructor needs to call super()
    public  Alberta() {
        super();
    }

    // implementations for all the getters and setters:
    @Override
    public Integer getItemId() {
        return this.itemId;
    }

    @Override
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    @Override
    public String getItemName() {
        return this.itemName;
    }

    @Override
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public Double getUnitPrice() {
        return this.unitPrice;
    }

    @Override
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // implementation according to specifications:
    @Override
    public Double getTotalPrice() {
        return ( (this.unitPrice * this.itemId) + (this.unitPrice*this.itemId*0.07));
    }

    @Override
    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return itemName + " with unit price " + this.unitPrice + " with GST costed " + this.getTotalPrice();
    }
}
