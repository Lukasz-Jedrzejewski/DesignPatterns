package com.legion.template.components;

public class TransferMoneyTask extends Task {

    public TransferMoneyTask(Customer customer) {
        super(customer);
    }

    @Override
    protected void doExecute() {
        System.out.println("transaction done.");
    }
}
