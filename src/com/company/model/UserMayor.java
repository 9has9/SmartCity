package com.company.model;

public class UserMayor extends Loginers{

    public UserMayor() {
        super("has", "123");
    }

    public UserMayor(String userName, String password) {
        super(userName, password);
    }
}
