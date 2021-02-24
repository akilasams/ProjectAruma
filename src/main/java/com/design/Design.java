package com.design;

public class Design {
    private int designId;
    private String designName;
    private int designTypeId;
    private int isInStore;
    private String designDescription;
    private int userId;
    //private String designLocationPath;


    public Design(int designId, String designName, int designTypeId, int isInStore, String designDescription, int userId) {
        this.designId = designId;
        this.designName = designName;
        this.designTypeId = designTypeId;
        this.isInStore = isInStore;
        this.designDescription = designDescription;
        this.userId = userId;
    }

    public Design(int designId, String designName, String designDescription, int userId) {
        this.designId = designId;
        this.designName = designName;
        this.designDescription = designDescription;
        this.userId = userId;
    }

    public Design(String designName, int designTypeId, int isInStore, String designDescription, int userId) {
        this.designName = designName;
        this.designTypeId = designTypeId;
        this.isInStore = isInStore;
        this.designDescription = designDescription;
        this.userId = userId;
        //this.designLocationPath = designLocationPath;
    }

    public int getDesignId() {
        return designId;
    }

    public void setDesignId(int designId) {
        this.designId = designId;
    }

    public String getDesignName() {
        return designName;
    }

    public void setDesignName(String designName) {
        this.designName = designName;
    }

    public int getDesignTypeId() {
        return designTypeId;
    }

    public void setDesignTypeId(int designTypeId) {
        this.designTypeId = designTypeId;
    }

    public int isInStore() {
        return isInStore;
    }

    public void setInStore(int inStore) {
        isInStore = inStore;
    }

    public String getDesignDescription() {
        return designDescription;
    }

    public void setDesignDescription(String designDescription) {
        this.designDescription = designDescription;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

//    public String getDesignLocationPath() {
//        return designLocationPath;
//    }
//
//    public void setDesignLocationPath(String designLocationPath) {
//        this.designLocationPath = designLocationPath;
//    }
}
