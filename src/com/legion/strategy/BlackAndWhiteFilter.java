package com.legion.strategy;

public class BlackAndWhiteFilter implements Filter {

    @Override
    public void apply(String fileName) {
        System.out.println(String.format("Applying %s", this.getClass().getName()));
    }
}
