package com.legion.template;

import com.legion.template.components.Customer;
import com.legion.template.components.GenerateReportTask;
import com.legion.template.components.Task;
import com.legion.template.components.TransferMoneyTask;

public class Main {

    public static void main(String[] args) {

        Task t1 = new TransferMoneyTask(new Customer("John", "Doe"));
        t1.execute();
        System.out.println("***");
        Task t2 = new GenerateReportTask(new Customer("John", "Doe"));
        t2.execute();
    }
}
