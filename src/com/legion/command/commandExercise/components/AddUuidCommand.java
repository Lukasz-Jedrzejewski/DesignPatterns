package com.legion.command.commandExercise.components;

import com.legion.command.commandExercise.command.Command;

public class AddUuidCommand implements Command {

    private Model model;
    private UUIDService service;

    public AddUuidCommand(Model model, UUIDService service) {
        this.model = model;
        this.service = service;
    }

    @Override
    public void execute() {
        model.setText(service.create());
        System.out.println(model.getText());
    }
}
