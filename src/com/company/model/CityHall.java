package com.company.model;

public class CityHall {

    private String firstName;
    private String lastName;
    private String personalID;
    private String dateOfEmployment;
    private String income;

    public CityHall() {
        this("", "", "", "", "");
    }

    public CityHall(String firstName, String lastName, String personalID, String dateOfEmployeement, String income) {
        setFirstName(firstName);
        setLastName(lastName);
        setPersonalID(personalID);
        setDateOfEmployment(dateOfEmployeement);
        setIncome(income);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonalID() {
        return personalID;
    }

    public void setPersonalID(String personalID) {
        this.personalID = personalID;
    }

    public String getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(String dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }
}
