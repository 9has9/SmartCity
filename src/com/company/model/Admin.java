package com.company.model;

public class Admin extends Loginers{

    public Admin() {
        super("hsh", "123");
    }

    public Admin(String userName, String password) {
        super(userName, password);
    }
}
