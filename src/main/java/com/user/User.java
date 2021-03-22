package com.user;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private int user_role_id;
    private String email;
    private String mobileNo;
    private String address;
    private String city;
    private String username;
    private String password;
    private String profPic;

    public User() {
    }

    public User(int id, String firstName, String lastName, int user_role_id, String email, String mobileNo, String address, String city, String username, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.user_role_id = user_role_id;
        this.email = email;
        this.mobileNo = mobileNo;
        this.address = address;
        this.city = city;
        this.username = username;
        this.password = password;
    }

    public User(String firstName, String lastName, int user_role_id, String email, String mobileNo, String address, String city, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.user_role_id = user_role_id;
        this.email = email;
        this.mobileNo = mobileNo;
        this.address = address;
        this.city = city;
        this.username = username;
        this.password = password;
    }

    public User(String username, String address,String email, String mobileNo, String profPic) {
        this.username = username;
        this.address = address;
        this.email = email;
        this.mobileNo = mobileNo;
        this.profPic = profPic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getUser_role_id() {
        return user_role_id;
    }

    public void setUser_role_id(int user_role_id) {
        this.user_role_id = user_role_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfPic() { return profPic; }

    public void setProfPic(String profPic) { this.profPic = profPic; }
}
