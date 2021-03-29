package com.storeOrder;

import java.util.List;

public class StoreOrder {
    private int orderId;
    private int cartId;
    private String orderDate;
    private double total;
    List<StoreOrderItem> itemsList;

    public StoreOrder(int cartId, List<StoreOrderItem> itemsList) {
        this.cartId = cartId;
        this.itemsList = itemsList;
    }

    public StoreOrder(int cartId, double total, List<StoreOrderItem> itemsList) {
        this.cartId = cartId;
        this.itemsList = itemsList;
    }

    public StoreOrder(int orderId, int cartId, double total, List<StoreOrderItem> itemsList) {
        this.orderId = orderId;
        this.cartId = cartId;
        this.total = total;
        this.itemsList = itemsList;
    }

    public StoreOrder(int orderId, int cartId, String orderDate, double total) {
        this.orderId = orderId;
        this.cartId = cartId;
        this.orderDate = orderDate;
        this.total = total;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<StoreOrderItem> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<StoreOrderItem> itemsList) {
        this.itemsList = itemsList;
    }
}
