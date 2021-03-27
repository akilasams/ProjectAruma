package com.addDesign;

public class AddDesignMem {

    private String design_name;
    private String designtype_id;
    //    private String in_store;
    private String design_description;
    private int user_id;

    public AddDesignMem(String design_name, String designtype_id, String design_description, int user_id) {
        super();
        this.design_name = design_name;
        this.designtype_id = designtype_id;
//        this.in_store = in_store;
        this.design_description = design_description;
        this.user_id = user_id;
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

    public String getDesigntype_id() {
        return designtype_id;
    }

    public void setDesigntype_id(String designtype_id) {
        this.designtype_id = designtype_id;
    }

//    public void setIn_store(String in_store) {
//        this.in_store = in_store;
//    }
//
//    public String getIn_store() { return in_store;}

    public String getDesign_description() {
        return design_description;
    }

    public void setDesign_description(String design_description) {
        this.design_description = design_description;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
