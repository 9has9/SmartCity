package com.company.model;

public class Guard extends CityHall{

    private String shift;

    public Guard() {
        this("");
    }

    public Guard(String shift) {
        super();
        setShift(shift);
    }

    public Guard(String shift, String firstName, String lastName, String personalID,
                 String dateOfEmployment, String income) {
        super(firstName, lastName, personalID, dateOfEmployment, income);
        setShift(shift);
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

}
