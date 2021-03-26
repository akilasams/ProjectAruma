package com.viewAll;

public class viewAlldesignsMem {
    private String design_id;
    private String design_name;
    private String designtype_id;
    private String in_store;
    private String design_description;
    private String stock;
    private String unit_price;
    private String additional_details;
    private String published_date;

    public viewAlldesignsMem(String design_id, String design_name, String designtype_id, String in_store, String design_description, String stock, String unit_price, String additional_details, String published_date) {
        super();
        this.design_id = design_id;
        this.design_name = design_name;
        this.designtype_id = designtype_id;
        this.in_store = in_store;
        this.design_description = design_description;

        this.stock = stock;
        this.unit_price = unit_price;
        this.additional_details = additional_details;
        this.published_date = published_date;
    }

    public viewAlldesignsMem() {
        super();
    }

    public String getDesign_id() {
        return design_id;
    }

    public void setDesign_id(String design_id) {
        this.design_id = design_id;
    }

    public String getDesign_name() {
        return design_name;
    }

    public void setDesign_name(String design_name) {
        this.design_name = design_name;
    }

    public String getDesigntype_id() {
        return designtype_id;
    }

    public void setDesigntype_id(String designtype_id) {
        this.designtype_id = designtype_id;
    }

    public String getIn_store() {
        return in_store;
    }

    public void setIn_store(String in_store) {
        this.in_store = in_store;
    }

    public String getDesign_description() {
        return design_description;
    }

    public void setDesign_description(String design_description) {
        this.design_description = design_description;
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
}
