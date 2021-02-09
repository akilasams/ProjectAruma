package com.addDesign;

public class AddDesignMem {

    private String design_name;
    private String design_type;
    private String in_store;
    private String design_description;

    public AddDesignMem(String design_name, String design_type, String in_store, String design_description) {
        super();
        this.design_name = design_name;
        this.design_type = design_type;
        this.in_store = in_store;
        this.design_description = design_description;
    }

    public AddDesignMem() {
        super();
    }

    public String getDesign_name() {
        return design_name;
    }

    public void setDesign_name(String design_name) {
        this.design_name = design_name;
    }

    public String getDesign_type() {
        return design_type;
    }

    public void setDesign_type(String design_type) {
        this.design_type = design_type;
    }

    public void setIn_store(String in_store) {
        this.in_store = in_store;
    }

    public String getIn_store() { return in_store;}

    public String getDesign_description() {
        return design_description;
    }

    public void setDesign_description(String design_description) {
        this.design_description = design_description;
    }
}
