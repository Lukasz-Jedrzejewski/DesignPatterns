package com.legion.strategy;

public class SvgCompressor implements Compressor {

    @Override
    public void compress(String fileName) {
        System.out.println(String.format("Compressing file %s using SVG"));
    }
}
