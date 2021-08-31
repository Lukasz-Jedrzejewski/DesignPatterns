package com.legion.state;

public class UpButton implements Button {

    @Override
    public void press() {
        System.out.println("Go forward");
    }

    @Override
    public void release() {
        System.out.println("Stop");
    }
}
