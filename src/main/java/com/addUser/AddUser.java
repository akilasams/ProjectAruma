package com.addUser;

public class AddUser  {
    private String user_id,first_name,last_name, user_role_id,email,mobile_no,address,city,username,password,category_id,bio,prof_pic;
    //private int user_id, user_role_id,category_id;

    public AddUser() {
        super();
    }

    public AddUser( String first_name, String last_name, String user_role_id, String email, String mobile_no,
                   String address, String city, String username, String password) {
        super();
        this.user_id = user_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.user_role_id = user_role_id;
        this.email = email;
        this.mobile_no = mobile_no;
        this.address = address;
        this.city = city;
        this.username = username;
        this.password = password;
        this.category_id = category_id;
        this.bio = bio;
        this.prof_pic = prof_pic;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUser_role_id() {
        return user_role_id;
    }

    public void setUser_role_id(String user_role_id) {
        this.user_role_id = user_role_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
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

}
