package com.company.model;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private int nationalCode;
    private int age;
    private String gender;
    private int phoneNumber;
    private String address;

    public User() {
        this.setId(-1);
        this.setFirstName("");
        this.setLastName("");
        this.setNationalCode(0);
        this.setAge(0);
        this.setGender("");
        this.setPhoneNumber(0);
        this.setAddress("");
    }
    public User(String firstName, String lastName, int nationalCode, int age, String gender, int phoneNumber, String address) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setNationalCode(nationalCode);
        this.setAge(age);
        this.setGender(gender);
        this.setPhoneNumber(phoneNumber);
        this.setAddress(address);
    }
    public User(int id, String firstName, String lastName, int nationalCode, int age, String gender, int phoneNumber, String address) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setNationalCode(nationalCode);
        this.setAge(age);
        this.setGender(gender);
        this.setPhoneNumber(phoneNumber);
        this.setAddress(address);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(int nationalCode) {
        this.nationalCode = nationalCode;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
