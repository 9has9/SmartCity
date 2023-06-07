package com.company.model;

public class Deputy extends CityHall{

    private String education;

    public Deputy() {
        this("");
    }

    public Deputy(String education) {
        super();
        setEducation(education);
    }

    public Deputy(String education, String firstName, String lastName, String personalID,
                  String dateOfEmployment, String income) {
        super(firstName, lastName, personalID, dateOfEmployment, income);
        setEducation(education);
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

}
