package com.legion.template.components;

public abstract class Task {
    private Customer customer;

    public Task(Customer customer) {
        this.customer = customer;
    }

    public void execute() {
        customer.record();

        doExecute();
    }

    protected abstract void doExecute();
}
