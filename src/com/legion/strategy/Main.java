package com.legion.strategy;

public class Main {

    public static void main(String[] args) {

        ItemStorage storage = new ItemStorage();
        storage.store("photo", new JpgCompressor(), new BlurFilter());
        System.out.println();
        storage.store("photo", new PngCompressor(), new BlurFilter());
        System.out.println();
        storage.store("photo", new SvgCompressor(), new BlackAndWhiteFilter());
    }
}
