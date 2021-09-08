package com.legion.command.commandExercise.components;

import com.legion.command.commandExercise.command.Command;

public class RemoveCharactersCommand implements Command {

    private Model model;

    public RemoveCharactersCommand(Model model) {
        this.model = model;
    }

    @Override
    public void execute() {
        model.setText(model.getText().replaceAll("[a-z-]", ""));
        System.out.println(model.getText());
    }
}
