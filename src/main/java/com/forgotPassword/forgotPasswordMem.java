package com.forgotPassword;

public class forgotPasswordMem {
    private String email;
    private String newPass;
    private String retypePass;

    public forgotPasswordMem(String email,String newPass, String retypePass) {
        super();
        this.newPass = newPass;
        this.retypePass = retypePass;
    }

    public forgotPasswordMem() {
        super();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getNewPass() {
        return newPass;
    }

    public void setNewPass(String newPass) {
        this.newPass = newPass;
    }

    public String getRetypePass() {
        return retypePass;
    }

    public void setRetypePass(String retypePass) {
        this.retypePass = retypePass;
    }
}
