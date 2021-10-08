package com.legion.observer.exercise;

public class SmsSender implements Observer {

    @Override
    public void update(DataSource src) {
        for (Subscriber subscriber : src.getSubscribers()) {
            System.out.println("Sending sms to " + subscriber.getPhoneNumber());
        }
    }
}
