package com.company.model;

import com.company.controller.DataBase;

import java.sql.SQLException;
import java.util.ArrayList;

public class LibraryManager extends User{
    private int id;
    private String userName;
    private String password;

    public LibraryManager() {
        this(-1, "", "");
    }

    public LibraryManager(String userName, String password) {
        super();
        this.setId(-1);
        this.setUserName(userName);
        this.setPassword(password);
    }
    public LibraryManager(int id, String userName, String password) {
        super();
        this.setId(id);
        this.setUserName(userName);
        this.setPassword(password);
    }
    public LibraryManager(String firstName, String lastName
            , int nationalCode, int age, String gender, int phoneNumber, String address, String userName, String password) {

        super(firstName, lastName, nationalCode, age, gender, phoneNumber, address);
        this.setId(-1);
        this.setUserName(userName);
        this.setPassword(password);
    }
    public LibraryManager(int id, String firstName, String lastName
            , int nationalCode, int age, String gender, int phoneNumber, String address, String userName, String password) {

        super(firstName, lastName, nationalCode, age, gender, phoneNumber, address);
        this.setId(id);
        this.setUserName(userName);
        this.setPassword(password);
    }

    public static void createTableForLibraryManagers() {
        try {
            DataBase.createTableForLibraryManagers();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteTableOfLibraryManagers() {
        try {
            DataBase.deleteTableOfLibraryManagers();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<LibraryManager> getAllLibraryManagers() {
        try {
            return DataBase.getAllLibraryManagers();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void save() {
        if (this.id == -1) {
            try {
                this.id = DataBase.insertLibraryManager(this);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }else {
            try {
                DataBase.updateLibraryManager(this);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void delete() {
        try {
            DataBase.deleteLibraryManager(this);
            this.id = -1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
