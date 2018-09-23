package com.example.java;

public class Employees {

    private String firstName;
    private String lastName;
    private int idNumber;
    private int shiftNumber;

    public Employees(String firstName, String lastName, int idNumber, int shiftNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.shiftNumber = shiftNumber;
    }

    public String getFirstName() {return firstName;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {this.idNumber = idNumber;}

    public int getShiftNumber() {
        return shiftNumber;
    }

    public void setShiftNumber(int shiftNumber){this.shiftNumber = shiftNumber;}

    public void printAll(){
        System.out.println(firstName + "\n" + lastName + "\nID Number: " + idNumber + "\nShift Number: " + shiftNumber);
    }
}
