package com.storeItem;

import com.design.Design;
import com.user.User;

public class StoreItem extends Design {
    private String firstName;
    private String lastName;
    private int stock;
    private String designType;
    private double unitPrice;
    private String additionalDetails;
    private String publishedDate;

    public StoreItem(int designId, String designName, String designDescription, int userId, String firstName, String lastName, int stock, String designType, double unitPrice, String additionalDetails, String publishedDate) {
        super(designId, designName, designDescription, userId);
        this.firstName = firstName;
        this.lastName = lastName;
        this.stock = stock;
        this.designType = designType;
        this.unitPrice = unitPrice;
        this.additionalDetails = additionalDetails;
        this.publishedDate = publishedDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDesignType() {
        return designType;
    }

    public void setDesignType(String designType) {
        this.designType = designType;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getAdditionalDetails() {
        return additionalDetails;
    }

    public void setAdditionalDetails(String additionalDetails) {
        this.additionalDetails = additionalDetails;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }
}
