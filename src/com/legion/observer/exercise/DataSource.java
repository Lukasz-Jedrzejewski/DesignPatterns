package com.legion.observer.exercise;

import java.util.ArrayList;
import java.util.List;

public class DataSource extends Subject {

    private List<Subscriber> subscribers = new ArrayList<>();
    private boolean isNew = false;

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void sendNotification() {
        if (isNew) {
            notifyObservers(this);
            setNew(false);
        } else {
            System.out.println("New content not released");
        }
    }
}
