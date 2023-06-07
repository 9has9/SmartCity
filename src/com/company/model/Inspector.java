package com.company.model;

public class Inspector extends CityHall{

    private String missions;

    public Inspector() {
        this("");
    }

    public Inspector(String missions) {
        super();
        setMissions(missions);
    }

    public Inspector(String missions, String firstName, String lastName, String personalID,
                     String dateOfEmployment, String income) {
        super(firstName, lastName, personalID, dateOfEmployment, income);
        setMissions(missions);
    }

    public String getMissions() {
        return missions;
    }

    public void setMissions(String missions) {
        this.missions = missions;
    }

}
