package com.storeOrder;

public class InstantPurchase {
    private int userId;
    private int cartId;
    private int itemId;
    private double unitPrice;
    private int quanity;

    public InstantPurchase(int userId, int itemId, double unitPrice, int quanity) {
        this.userId = userId;
        this.itemId = itemId;
        this.unitPrice = unitPrice;
        this.quanity = quanity;
    }

    public InstantPurchase(int userId, int cartId, int itemId, double unitPrice, int quanity) {
        this.userId = userId;
        this.cartId = cartId;
        this.itemId = itemId;
        this.unitPrice = unitPrice;
        this.quanity = quanity;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }
}
