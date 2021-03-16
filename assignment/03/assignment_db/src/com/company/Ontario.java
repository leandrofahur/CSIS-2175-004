package com.company;

public class Ontario extends Item {
    public  Ontario() {
        // ...
    }

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

    @Override
    public Double getTotalPrice() {
        return ( (this.unitPrice * this.itemId) + (this.unitPrice*this.itemId*0.15));
    }

    @Override
    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return itemName + " with unit price " + this.unitPrice + " with GST and PST costed " + this.totalPrice;
    }
}

