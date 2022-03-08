package com.company;

public class BusinessContact extends Contact{

    private String phoneNumber;

    public BusinessContact(String name, String email, String phoneNumber) {
        super(name, email);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Phone Number: " + phoneNumber);
    }
}
