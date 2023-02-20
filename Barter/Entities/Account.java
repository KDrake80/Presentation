package com.fx.barter.Entities;
public class Account {

    private String accountName;
    private String accountPass;
    private String firstName;
    private String lastName;

    public Account() {
    }

    public Account(String accountName, String accountPass, String firstName, String lastName) {
        this.accountName = accountName;
        this.accountPass = accountPass;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountPass() {
        return accountPass;
    }

    public void setAccountPass(String accountPass) {
        this.accountPass = accountPass;
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

    public void setLastName(String name) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", accountPass='" + accountPass + '\'' +
                ", name='" + firstName + " " + lastName + '\'' +
                '}';
    }
}
