package com.user;

public class Designer extends User{
    private String skills;

    public Designer(String firstName, String lastName, int user_role_id, String email, String address, String mobileNo, String username, String password, String skills) {
        super(firstName, lastName, user_role_id, email, address, mobileNo, username, password);
        this.skills = skills;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
