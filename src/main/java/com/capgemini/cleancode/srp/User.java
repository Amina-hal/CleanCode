package com.capgemini.cleancode.srp;

public class User {
    private String login;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String personalInfos;

    public void setFirstName(String firstName) throws Exception {
        if (firstName == null) throw new Exception("First name is mandatory");
        this.firstName = firstName;
    }

    public void setLastName(String lastName) throws Exception{
        if (lastName == null) throw new Exception("Last name is mandatory");
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) throws Exception{
        if (phoneNumber == null) throw new Exception("Phone number is mandatory");
        if (phoneNumber.length() != 10) throw new Exception("Phone number is not valid");
        this.phoneNumber = phoneNumber;
    }

    public void setLogin(String login) throws Exception {
        if (login == null) throw new Exception("login is mandatory");
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getLogin(){
        return login;
    }

    public String getPersonalInfos() {
        return personalInfos;
    }

    public void setPersonalInfos(String personalInfos) {
        this.personalInfos = personalInfos;
    }
}
