package com.viewstore;

public class viewSpecificsMem {

    private String stock;
    private String unit_price;
    private String additional_details;
    private String published_date;
    private String design_id;

    public viewSpecificsMem(String stock, String unit_price, String additional_details, String published_date, String design_id) {
        super();

        this.stock = stock;
        this.unit_price = unit_price;
        this.additional_details = additional_details;
        this.published_date = published_date;
        this.design_id = design_id;
    }

    public viewSpecificsMem() {
        super();
    }


    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(String unit_price) {
        this.unit_price = unit_price;
    }

    public String getAdditional_details() {
        return additional_details;
    }

    public void setAdditional_details(String additional_details) {
        this.additional_details = additional_details;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public String getDesign_id() {
        return design_id;
    }

    public void setDesign_id(String design_id) {
        this.design_id = design_id;
    }
}
