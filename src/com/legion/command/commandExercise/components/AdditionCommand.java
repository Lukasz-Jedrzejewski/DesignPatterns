package com.legion.command.commandExercise.components;

import com.legion.command.commandExercise.command.Command;

import java.util.Arrays;

public class AdditionCommand implements Command {

    private Model model;

    public AdditionCommand(Model model) {
        this.model = model;
    }

    @Override
    public void execute() {
        Integer sum = Arrays.stream(model.getText().split(""))
                .mapToInt(Integer::valueOf)
                .sum();
        model.setText(String.valueOf(sum));
        System.out.println(model.getText());
    }
}
