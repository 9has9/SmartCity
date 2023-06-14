package com.company.model;

import com.company.controller.DataBase;

import java.sql.SQLException;
import java.util.ArrayList;

public class Library {
    private int id;
    private String name;
    private String district;
    private String ownerFirstName;
    private String ownerLastName;
    private String establishedYear;
    private String ownerNumber;

    public Library() {
        this.setId(-1);
        this.setName("");
        this.setDistrict("");
        this.setOwnerFirstName("");
        this.setOwnerLastName("");
        this.setEstablishedYear("");
        this.setOwnerNumber("");
    }
    public Library(String libraryName, String district, String ownerFirstName, String ownerLastName, String establishedYear, String ownerNumber) {
        this.setId(-1);
        this.setName(libraryName);
        this.setDistrict(district);
        this.setOwnerFirstName(ownerFirstName);
        this.setOwnerLastName(ownerLastName);
        this.setEstablishedYear(establishedYear);
        this.setOwnerNumber(ownerNumber);
    }
    public Library(int id, String libraryName, String district, String ownerFirstName, String ownerLastName, String establishedYear, String ownerNumber) {
        this.setId(id);
        this.setName(libraryName);
        this.setDistrict(district);
        this.setOwnerFirstName(ownerFirstName);
        this.setOwnerLastName(ownerLastName);
        this.setEstablishedYear(establishedYear);
        this.setOwnerNumber(ownerNumber);
    }

    public static ArrayList<Library> getAllLibraries() {
        try {
            return DataBase.getAllLibraries();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void save() {
        if (this.id == -1) {
            try {
                this.id = DataBase.insertLibrary(this);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }else {
            try {
                DataBase.updateLibrary(this);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void delete() {
        try {
            DataBase.deleteLibrary(this);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public void setOwnerFirstName(String ownerFirstName) {
        this.ownerFirstName = ownerFirstName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }

    public String getEstablishedYear() {
        return establishedYear;
    }

    public void setEstablishedYear(String establishedYear) {
        this.establishedYear = establishedYear;
    }

    public String getOwnerNumber() {
        return ownerNumber;
    }

    public void setOwnerNumber(String ownerNumber) {
        this.ownerNumber = ownerNumber;
    }

}
