package com.legion.observer;

public class Chart implements Observer {

    @Override
    public void update() {
        System.out.println("chart got updated");
    }
}
