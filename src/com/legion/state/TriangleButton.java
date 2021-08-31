package com.legion.state;

public class TriangleButton implements Button {

    @Override
    public void press() {
        System.out.println("Prepare a blow with the right fist");
    }

    @Override
    public void release() {
        System.out.println("Hit with your right fist");
    }
}
