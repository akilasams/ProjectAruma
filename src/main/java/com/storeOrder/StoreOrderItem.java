package com.storeOrder;

public class StoreOrderItem {
    private int orderId;
    private int itemId;
    private int qantity;
    private double unitPrice;

    public StoreOrderItem(int orderId, int qantity, double unitPrice) {
        this.orderId = orderId;
        this.qantity = qantity;
        this.unitPrice = unitPrice;
    }

    public StoreOrderItem(int orderId, int itemId, int qantity, double unitPrice) {
        this.orderId = orderId;
        this.itemId = itemId;
        this.qantity = qantity;
        this.unitPrice = unitPrice;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getQantity() {
        return qantity;
    }

    public void setQantity(int qantity) {
        this.qantity = qantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
