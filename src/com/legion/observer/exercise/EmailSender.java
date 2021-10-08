package com.legion.observer.exercise;

public class EmailSender implements Observer {

    @Override
    public void update(DataSource src) {
        for (Subscriber subscriber : src.getSubscribers()) {
            System.out.println("Sending email to " + subscriber.getEmail());
        }
    }
}
