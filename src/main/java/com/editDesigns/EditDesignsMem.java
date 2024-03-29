package com.editDesigns;

public class EditDesignsMem {

    private String design_id;
    private String design_name;
    private String design_type;
    private String design_description;

    public EditDesignsMem(String design_id, String design_name, String design_type, String design_description) {
        super();
        this.design_id = design_id;
        this.design_name = design_name;
        this.design_type = design_type;
        this.design_description = design_description;
    }

    public EditDesignsMem() {
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

    public String getDesign_type() {
        return design_type;
    }

    public void setDesign_type(String design_type) {
        this.design_type = design_type;
    }

    public String getDesign_description() {
        return design_description;
    }

    public void setDesign_description(String design_description) {
        this.design_description = design_description;
    }
}
