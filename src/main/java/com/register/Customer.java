package com.register;

public class Customer extends User{
    public Customer(String firstName, String lastName, int user_role_id, String email, String address, String mobileNo, String username, String password) {
        super(firstName, lastName, user_role_id, email, address, mobileNo, username, password);
    }
}
