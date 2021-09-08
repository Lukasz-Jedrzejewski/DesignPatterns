package com.legion.command.commandExercise.components;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Model {

    private String text = "";

    public void makeLettersUpperCase() {
        text = Arrays.stream(text.split(""))
                .filter((s) -> s.matches("[a-z]"))
                .map(String::toUpperCase)
                .collect(Collectors.joining());
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
