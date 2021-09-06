package com.legion.template.components;

import java.util.UUID;

public class Customer {

    private UUID transferId = UUID.randomUUID();
    private String name;
    private String surname;

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void record() {
        System.out.println(String.format("An attempt to execute a transaction by %s %s. Transaction id: %s",
                name, surname, transferId));
    }
}
