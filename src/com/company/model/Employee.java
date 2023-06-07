package com.company.model;

public class Employee extends CityHall{

    private String whpw; //Working hours per week

    public Employee() {
        this("");
    }

    public Employee(String whpw) {
        super();
        setWhpw(whpw);
    }

    public Employee(String whpw, String firstName, String lastName, String personalID,
                    String dateOfEmployment, String income) {
        super(firstName, lastName, personalID, dateOfEmployment, income);
        setWhpw(whpw);
    }

    public String getWhpw() {
        return whpw;
    }

    public void setWhpw(String whpw) {
        this.whpw = whpw;
    }

}
