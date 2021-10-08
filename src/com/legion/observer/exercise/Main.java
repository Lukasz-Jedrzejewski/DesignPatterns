package com.legion.observer.exercise;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        DataSource dataSource = new DataSource();
        EmailSender emailSender = new EmailSender();
        SmsSender smsSender = new SmsSender();

        dataSource.addObserver(emailSender);
        dataSource.addObserver(smsSender);

        Subscriber s = new Subscriber(UUID.randomUUID().toString(), String.valueOf(Math.random()));
        Subscriber s1 = new Subscriber(UUID.randomUUID().toString(), String.valueOf(Math.random()));
        Subscriber s2 = new Subscriber(UUID.randomUUID().toString(), String.valueOf(Math.random()));

        dataSource.addSubscriber(s);
        dataSource.setNew(true);
        dataSource.sendNotification();
        System.out.println("*********");
        dataSource.addSubscriber(s1);
        dataSource.addSubscriber(s2);

        dataSource.setNew(true);
        dataSource.sendNotification();
        dataSource.sendNotification();

    }
}
