package com.read;

public class design_bean {
    private String design_id;
    private String design_name;
    private String designtype_id;
    private String in_store;
    private String design_description;

    public design_bean(String design_id, String design_name, String designtype_id, String in_store, String design_description) {
        super();
        this.design_id = design_id;
        this.design_name = design_name;
        this.designtype_id = designtype_id;
        this.in_store = in_store;
        this.design_description = design_description;
    }

    public design_bean() {
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
}
