package com.legion.template.components;

public class GenerateReportTask extends Task {

    public GenerateReportTask(Customer customer) {
        super(customer);
    }

    @Override
    protected void doExecute() {
        System.out.println("Report generated");
    }
}
