package com.user;

public class Designer extends User{
    private int serviceType;
    private String bio;

    public Designer(String firstName, String lastName, int user_role_id, String email, String mobileNo, String address, String city, String username, String password, int serviceType, String bio) {
        super(firstName, lastName, user_role_id, email, mobileNo, address, city, username, password);
        this.serviceType = serviceType;
        this.bio = bio;
    }

    public int getServiceType() {
        return serviceType;
    }

    public void setServiceType(int serviceType) {
        this.serviceType = serviceType;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
