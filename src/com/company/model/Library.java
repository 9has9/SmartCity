package com.company.model;

public class Library {
    private String name;
    private String district;
    private String ownerFirstName;
    private String ownerLastName;
    private String establishedYear;
    private String ownerNumber;

    public Library() {
        this.setName("");
        this.setDistrict("");
        this.setOwnerFirstName("");
        this.setOwnerLastName("");
        this.setEstablishedYear("");
        this.setOwnerNumber("");
    }
    public Library(String libraryName, String district, String ownerFirstName, String ownerLastName, String establishedYear, String ownerNumber) {
        this.setName(libraryName);
        this.setDistrict(district);
        this.setOwnerFirstName(ownerFirstName);
        this.setOwnerLastName(ownerLastName);
        this.setEstablishedYear(establishedYear);
        this.setOwnerNumber(ownerNumber);
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
