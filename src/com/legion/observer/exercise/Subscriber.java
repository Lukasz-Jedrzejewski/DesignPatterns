package com.legion.observer.exercise;

public class Subscriber {

    private String email;
    private String phoneNumber;

    public Subscriber(String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
