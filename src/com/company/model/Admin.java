package com.company.model;

public class Admin {

    private String userName;
    private String password;

    public Admin() {
        this.setUserName("hsh");
        this.setPassword("123");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
