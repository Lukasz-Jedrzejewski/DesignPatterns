package com.legion.strategy;

public class JpgCompressor implements Compressor {

    @Override
    public void compress(String fileName) {
        System.out.println(String.format("Compressing file %s using JPG", fileName));
    }
}
