package com.company.model;

public class Mayor extends CityHall{

    private String district;

    public Mayor() {
        this("0");
    }

    public Mayor(String district) {
        super();
        setDistrict(district);
    }

    public Mayor(String district, String firstName, String lastName, String personalID,
                 String dateOfEmployment, String income) {
        super(firstName, lastName, personalID, dateOfEmployment, income);
        setDistrict(district);
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

}
