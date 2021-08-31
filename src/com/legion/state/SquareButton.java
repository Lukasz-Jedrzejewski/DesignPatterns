package com.legion.state;

public class SquareButton implements Button {

    @Override
    public void press() {
        System.out.println("Prepare a blow with the left fist");
    }

    @Override
    public void release() {
        System.out.println("Hit with your left fist");
    }
}
