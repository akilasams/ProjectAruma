package com.design;

public class Design {
    private int designId;
    private String designName;
    private String designType;
    private boolean isInStore;
    private String designDescription;
    private int userId;
    private String designLocationPath;

    public Design(String designName, String designType, boolean isInStore, String designDescription, int userId, String designLocationPath) {
        this.designName = designName;
        this.designType = designType;
        this.isInStore = isInStore;
        this.designDescription = designDescription;
        this.userId = userId;
        this.designLocationPath = designLocationPath;
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

    public String getDesignType() {
        return designType;
    }

    public void setDesignType(String designType) {
        this.designType = designType;
    }

    public boolean isInStore() {
        return isInStore;
    }

    public void setInStore(boolean inStore) {
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

    public String getDesignLocationPath() {
        return designLocationPath;
    }

    public void setDesignLocationPath(String designLocationPath) {
        this.designLocationPath = designLocationPath;
    }
}
