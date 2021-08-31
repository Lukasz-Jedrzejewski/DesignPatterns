package com.legion.state;

public class DownButton implements Button {

    @Override
    public void press() {
        System.out.println("Go backwards");
    }

    @Override
    public void release() {
        System.out.println("Stop");
    }
}
